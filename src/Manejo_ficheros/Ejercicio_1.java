package Manejo_ficheros;

import java.io.File;
import java.io.IOException;

public class Ejercicio_1 {
    public static void main(String[] args) {

        // Crea un directorio (NUEVODIR) y dos ficheros en su interior (FICHERO1. TXT y
        //FICHERO2.TXT. Posteriormente, renombra el fichero1.txt a fichero1-copia.txt

        // Crear el directorio
        File d = new File("NUEVODIR");

        // Comprobar si el directorio ya existe
        if (!d.exists()) {
            // Si no existe, intentar crearlo
            if (d.mkdir()) {
                System.out.println("Directorio creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el directorio.");
                return; // Salir del programa si no se pudo crear el directorio
            }
        } else {
            System.out.println("El directorio ya existe.");
        }

        // Crear los archivos dentro del directorio
        File archivo1 = new File(d, "FICHERO1.TXT");
        File archivo2 = new File(d, "FICHERO2.TXT");

        try {
            // Intentar crear el archivo1.txt
            if (archivo1.createNewFile()) {
                System.out.println("Archivo 1 creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el archivo 1.");
            }
            // Intentar crear el archivo2.txt
            if (archivo2.createNewFile()) {
                System.out.println("Archivo 2 creado exitosamente.");
            } else {
                System.err.println("No se pudo crear el archivo 2.");
            }

            // Renombrar el archivo2.txt a "nuevo_fichero2.txt"
            File nuevoArchivo1 = new File(d, "fichero1-copia.txt");
            if (archivo1.renameTo(nuevoArchivo1)) {
                System.out.println("Archivo 1 renombrado exitosamente a " + "fichero1-copia.txt");
            } else {
                System.err.println("No se pudo renombrar el archivo 1.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
