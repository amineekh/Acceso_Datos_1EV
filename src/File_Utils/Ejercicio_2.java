package File_Utils;

import java.io.File;
import java.io.IOException;

public class Ejercicio_2 {
    public static void main(String[] args) {

        //Crea un fichero llamado ejercicio1, dentro del directorio ejercicios


        // Especifica el nombre del directorio
        String directorioNombre = "ejercicios";

        // Verifica si el directorio "ejercicios" existe o no
        File d = new File(directorioNombre);

        if (!d.exists()) {
            // Si no existe, intenta crear el directorio
            if (d.mkdir()) {
                System.out.println("Directorio '" + directorioNombre + "' creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el directorio '" + directorioNombre + "'.");
                return; // Salir del programa si no se pudo crear el directorio
            }
        }


        // crear el fichero

        File fichero = new File(d,"ejercicio1");

        try {
            if (fichero.createNewFile()) {
                System.out.println("Fichero '" + fichero  + "' creado exitosamente en el directorio '" + directorioNombre + "'.");
            } else {
                System.err.println("No se pudo crear el fichero '" + fichero  + "'.");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejar excepciones de entrada/salida (IOException)
        }






    }
}
