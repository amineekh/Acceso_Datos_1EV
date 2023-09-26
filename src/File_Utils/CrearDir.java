package File_Utils;

import java.io.File;
import java.io.IOException;

public class CrearDir {
    public static void main(String[] args) {

        // crear el directorio
        // Crear un fichero txt: fichero1.txt
        // Crear un fichero txt: fichero2.txt
        // renombrar el fichero2.txt a fichero2.copia.txt
        //hacer uso de exepciones

        // Crear el directorio
        File d = new File("mi_directorio");

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
        File archivo1 = new File(d, "fichero1.txt");
        File archivo2 = new File(d, "fichero2.txt");

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
            File nuevoArchivo2 = new File(d, "nuevo_fichero2.txt");
            if (archivo2.renameTo(nuevoArchivo2)) {
                System.out.println("Archivo 2 renombrado exitosamente a " + "nuevo_fichero2.txt");
            } else {
                System.err.println("No se pudo renombrar el archivo 2.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
