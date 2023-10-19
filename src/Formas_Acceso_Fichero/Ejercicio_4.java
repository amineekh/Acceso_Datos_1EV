package Formas_Acceso_Fichero;
import java.io.*;

public class Ejercicio_4{

    public static void main(String[] args) throws IOException {
        // Creamos un objeto de la clase FileReader para leer el fichero
        FileReader fichero = new FileReader("FichTexto.txt");

        // Leemos el contenido del fichero
        int caracter;
        while ((caracter = fichero.read()) != -1) {
            System.out.print((char) caracter);
        }

        // Cerramos el fichero
        fichero.close();
    }
}