package File_Utils;

import java.io.File;
import java.io.IOException;

public class Ejercicio_2 {
    public static void main(String[] args) {

        //Ejercicio 2:
        //Crea un fichero llamado ejercicio1, dentro del directorio ejercicios


        // 1. Especificamos el nombre del directorio
        String directorioNombre = "ejercicios";

        // 2. Crear un objeto File para representar el directorio "ejercicios"
        File d = new File(directorioNombre);

        // 3. Verificar si el directorio "ejercicios" existe o no
        if (!d.exists()) {
            // 4. Si no existe, intentar crear el directorio
            if (d.mkdir()) {
                System.out.println("Directorio '" + directorioNombre + "' creado exitosamente.");
            } else {
                // 5. Si no se pudo crear el directorio, imprimir un mensaje de error y salir del programa
                System.err.println("No se pudo crear el directorio '" + directorioNombre + "'.");
                return; // Salir del programa si no se pudo crear el directorio
            }
        }


        // 6. Crear el objeto File para representar el fichero "ejercicio1" dentro del directorio "ejercicios"
        File fichero = new File(d,"ejercicio1");

        try {
            // 7. Intentar crear el fichero "ejercicio1"
            if (fichero.createNewFile()) {
                System.out.println("Fichero '" + fichero  + "' creado exitosamente en el directorio '" + directorioNombre + "'.");
            } else {
                // 8. Si no se pudo crear el fichero, imprimir un mensaje de error
                System.err.println("No se pudo crear el fichero '" + fichero  + "'.");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Manejar excepciones de entrada/salida (IOException)
        }

    }
}
