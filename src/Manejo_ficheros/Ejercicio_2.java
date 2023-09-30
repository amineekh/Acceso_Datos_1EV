package Manejo_ficheros;

import java.io.File;

public class Ejercicio_2 {
    public static void main(String[] args) {

        //ENUNCIADO
        //Crea un directorio (NUEVODIR) y dos ficheros en su interior (FICHERO1. TXT y
        //FICHERO2.TXT. Posteriormente, procede al borrado de los tres.

        //PARTE 1: BOORAMOS FICHERO 1
        //ruta fichero 1
        String RutaCompleta = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NUEVODIR\\fichero1-copia.txt";

        // crea un objeto file para representar el fichero
        File fichero = new File(RutaCompleta);

        // Verifica si el fichero existe
        if (fichero.exists()) {
            // Intenta eliminar el fichero
            if (fichero.delete()) {
                System.out.println("Fichero eliminado con éxito.");
            } else {
                System.err.println("No se pudo eliminar el fichero.");
            }
        } else {
            System.err.println("El fichero no existe en la ruta especificada.");
        }

        //PARTE 2: BOORAMOS FICHERO 2
        //ruta fichero 2

        // almcenamos la ruta del fichero 2 con la misma variable para ahorrar memoria
        RutaCompleta = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NUEVODIR\\FICHERO2.TXT";

        // crea un objeto file para represental el fichero
        File fichero2 = new File(RutaCompleta);
        // Verifica si el fichero existe
        if (fichero2.exists()) {
            // Intenta eliminar el fichero
            if (fichero2.delete()) {
                System.out.println("Fichero eliminado con éxito.");
            } else {
                System.err.println("No se pudo eliminar el fichero.");
            }
        } else {
            System.err.println("El fichero no existe en la ruta especificada.");
        }


        //PARTE 3: BOORAMOS directorio
        //ruta directorio

        // almcenamos la ruta del fichero 2 con la misma variable para ahorrar memoria
        RutaCompleta = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NUEVODIR";

        // crea un objeto file para represental el fichero
        File dir = new File(RutaCompleta);
        // Verifica si el fichero existe
        if (dir.exists()) {
            // Intenta eliminar el fichero
            if (dir.delete()) {
                System.out.println("directorio eliminado con éxito.");
            } else {
                System.err.println("No se pudo eliminar el fichero.");
            }
        } else {
            System.err.println("El directorio no existe en la ruta especificada.");
        }
    }
}
