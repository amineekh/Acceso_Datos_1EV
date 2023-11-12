package Formas_Acceso_Fichero;
import java.io.*;

public class Ejercicio_4{

    public static void main(String[] args) throws IOException {
        //Ejercicio 4:
        //En el directorio de trabajo de IntelliJ, crea un programa en Java que lea el contenido del
        //fichero FichTexto.txt. Haz uso de la clase FileReader.

        // 1. Creamos un objeto de la clase FileReader para leer el fichero
        FileReader fichero = new FileReader("FichTexto.txt");

        // 2. Leemos el contenido del fichero
        int caracter;
        while ((caracter = fichero.read()) != -1) {
            // 3. Imprimimos cada caracter del fichero
            System.out.print((char) caracter);
        }

        // Cerramos el fichero
        fichero.close();
    }
}