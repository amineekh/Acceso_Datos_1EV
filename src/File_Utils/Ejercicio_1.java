package File_Utils;

import java.io.File;

public class Ejercicio_1 {
    public static void main(String[] args) {
// Ejercicio 1:
        // Crea un directorio llamado ”ejercicios”.

        // 1. Creamos un objeto File en Java que representa el directorio llamado "ejercicios".
        File d = new File("ejercicios");

        // 2. Comprobar si el directorio ya existe
        if (!d.exists()) {
            // 3. Si no existe, intentar crearlo
            if (d.mkdir()) {
                System.out.println("El directorio ha sido creado correctamente.");
            } else {
                // 4. Si no se pudo crear el directorio, imprimir un mensaje de error y salir del programa
                System.err.println("No se pudo crear el directorio.");

            }
        } else {
            // 5. Si el directorio ya existe, imprimir un mensaje indicándolo
            System.out.println("El directorio ya existe.");
        }
        // 6.  imprimimos  la ruta absoluta del directorio creado.
        System.out.println("Ruta absoluta del directorio: " + d.getAbsolutePath());

    }
}

