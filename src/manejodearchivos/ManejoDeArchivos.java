
package manejodearchivos;
import java.io.File;
import java.io.IOException;
//import java.net.URI; -- solo con el metodo 3
//import java.net.URISyntaxException; --- solo con el metodo 3

public class ManejoDeArchivos {
  
    public static void main(String[] args) /*throws URISyntaxException---solo con el metodo 3*/{
        //Crear el archivo por medio de Ruta absoluta
        File file=new File("D:\\DOCMEME\\Netbeans proyects\\ManejoDeArchivos\\miarchivo.txt");
        
        //Metodo 2
        //File directorio=new File("D:\\DOCMEME\\Netbeans proyects\\ManejoDeArchivos");
        //File file=new File(directorio, "miarchivo.txt");
        
        //Metodo 3 Objeto o enlace Uri
        //URI uri = new URI("file:////D:/DOCMEME/Netbeans proyects/ManejoDeArchivos/miarchivo.txt");
        //File file = new File(uri);
       
        if(!file.exists()){
            try{
            file.createNewFile();
            System.out.println(file.getName()+" Ha sido creado");
            }catch(IOException ex){ex.printStackTrace();}
        }
        
        System.out.println("Nombre: "+file.getName());
        System.out.println("Ruta Absoluta: "+file.getAbsolutePath());
        System.out.println("Ruta: "+file.getPath());
        System.out.println("Se puede leer: "+file.canRead());
        System.out.println("Se puede escribir: "+file.canWrite());
        System.out.println("Se puede ejecutar: "+file.canExecute());
        System.out.println("Es un dierctorio: "+file.isDirectory());
        System.out.println("Ultima Modificacion: "+file.lastModified());
        System.out.println("Tamaño: "+file.length());
    }
}
