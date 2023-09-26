package File_Utils;

import java.io.File;
import java.io.IOException;

public class Ejercicio_4 {
    public static void main(String[] args) {

        // Crea un fichero llamado ejercicio2 , dentro del directorio ejercicios

        // especifica el directorio nombre
        String directorioNombre ="ejercicios";

        //verificamos el nombre del directorio
        File d = new File(directorioNombre);

        if (!d.exists()){
            //si no exxiste creamos el directorio
            if(d.mkdir()){
                System.out.println("Directorio '" + directorioNombre + "' creado exitosamente.");
            }
            else {
                System.err.println("No se pudo crear el directorio '" + directorioNombre + "'.");
                return; // Salir del programa si no se pudo crear el directorio
            }
        }

        //Crear el fichero
        File fichero = new  File(d, "ejercicio2");

        try{
            if (fichero.createNewFile()){
                System.out.println("Fichero '" + fichero  + "' creado exitosamente en el directorio '" + directorioNombre + "'.");
            } else {
                System.err.println("No se pudo crear el fichero '" + fichero  + "'.");
            }
        }catch (IOException e){
            e.printStackTrace(); // manejo exepciones
        }

    }
}
