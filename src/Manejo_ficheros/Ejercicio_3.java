package Manejo_ficheros;

import java.io.File;

public class Ejercicio_3 {
    public static void main(String[] args) {

        // ENUNCIADO
        //Muestra el número de ficheros del directorio que desees y que sea distinto al de ejecución

        // Ruta de la carpeta que deseas contar
        String folderPath = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Desarollo_Interfaces_1EV";

        // Crear un objeto File que represente la carpeta
        File folder = new File(folderPath);

        // Verificar si la ruta es una carpeta válida
        if (folder.isDirectory()) {
            // Obtener la lista de archivos en la carpeta
            File[] files = folder.listFiles();

            // Verificar si la lista de archivos no es nula
            if (files != null) {
                // Obtener el número de archivos en la carpeta
                int numberOfFiles = files.length;
                System.out.println("Número de archivos en la carpeta: " + numberOfFiles);
            } else {
                System.err.println("No se pudo obtener la lista de archivos.");
            }
        } else {
            System.err.println("La ruta especificada no es una carpeta válida.");
        }

    }
}
