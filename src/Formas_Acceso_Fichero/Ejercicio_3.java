package Formas_Acceso_Fichero;

import java.io.*;
public class Ejercicio_3 {

    public static void main(String[] args) throws IOException {
        try {
            // Creamos un objeto de la clase FileWriter para escribir en el fichero
            FileWriter fichero = new FileWriter("FichTexto.txt");

            // Escribimos el texto en el fichero
            fichero.write("Esto es texto escrito en un fichero de texto");

            // Cerramos el fichero
            fichero.close();
        } catch (IOException e) {
            // Capturamos la excepción
            System.out.println(e.getMessage());
        }

    }
}
