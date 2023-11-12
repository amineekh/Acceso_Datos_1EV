package Formas_Acceso_Fichero;

import java.io.*;
public class Ejercicio_3 {

    public static void main(String[] args) throws IOException {
        //Ejercicio 3:
        //En el directorio de trabajo de IntelliJ, crea un programa en Java que escriba en un fichero
        //llamado FichTexto.txt el siguiente texto: “Esto es texto escrito en un fichero de texto”. Haz uso
        //de la clase FileWriter.

        try {
            // 1. Creamos un objeto de la clase FileWriter para escribir en el fichero
            FileWriter fichero = new FileWriter("FichTexto.txt");

            // 2.  Escribimos el texto en el fichero
            fichero.write("Esto es texto escrito en un fichero de texto");

            // 3. Cerramos el fichero
            fichero.close();
        } catch (IOException e) {
            // 4. ponemos una excepción
            System.out.println(e.getMessage());
        }

    }
}
