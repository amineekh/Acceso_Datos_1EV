package Manejo_ficheros;
import java.io.File;

public class Ejercicio_5 {
    public static void main(String[] args) {

        //ENUNCIADO
        // Muestra el número de ficheros en el directorio y del tipo de sus elementos (Fich. o direc.)

        // Ruta de la carpeta que deseas contar
        String folderPath = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV";

        // Crear un objeto File que represente la carpeta
        File folder = new File(folderPath);

            // Obtener la lista de archivos y directorios en la carpeta
            File[] filesAndDirs = folder.listFiles();
            int contador = 0;
            // recoremos la carpeta para saber cuantos ficheros y directorios en total tiene
            for(int i =0;  i< filesAndDirs.length; i++){
                if (filesAndDirs[i].isFile() || filesAndDirs[i].isDirectory()){
                    contador++;
                }
                
            }
            System.out.println("ficheros en el direcorio actual: "+contador);

            // Recoremos cada elemento de la carpeta para asi mostar su nombre, SI es fichero o NO, o SI es directorio o NO
            for (File file :  filesAndDirs ){
                String name = file.getName();
                boolean isFile = file.isFile();
                boolean isDirectory = file.isDirectory();

                System.out.println("NOMBRE: "+name + " ,es fichero: " +isFile + " ,es directorio: " +isDirectory);
            }
    }
}
