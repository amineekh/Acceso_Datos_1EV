package AD_ficheros_OBJETO;

import java.util.Scanner;
import java.io.*;

public class ficheros_Binarios_Persona {

    public static void main(String[] args) {
        // Creación de un objeto de tipo File con el nombre de archivo "persona12"
        File file = new File("persona1");
        // Llamada al método guardarObjeto con el objeto file como argumento
        guardarObjeto(file);
        // Llamada al método recuperarObjeto con el objeto file como argumento
        recuperarObjeto(file);
    }

    public static void guardarObjeto(File file) {
        try {
            // Creación de un flujo de salida de bytes hacia el archivo
            //El objeto fileOut se utiliza para escribir bytes en el archivo.
            FileOutputStream fileOut = new FileOutputStream(file);
            // Creación de un ObjectOutputStream que se conecta al flujo de salida de bytes
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Creación de unA INSTANCIA objeto de la clase Persona
            Persona persona = new Persona(1, "messi", 30, "123456789A");

            // Escribir el objeto persona en el flujo de salida
            out.writeObject(persona);

            // Cerrar el ObjectOutputStream y el flujo de salida de bytes
            out.close();
            fileOut.close();
        } catch (IOException e) {
            // Captura de cualquier excepción de tipo IOException e imprime la traza de la pila
            e.printStackTrace();
        }
    }

    public static void recuperarObjeto(File file) {
        try {
            // Creación de un flujo de entrada de bytes desde el archivo: El objeto fileIn se utiliza para leer los bytes del archivo.
            FileInputStream fileIn = new FileInputStream(file);
            // Creación de un ObjectInputStream que se conecta al flujo de entrada de bytes
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Lectura del objeto de tipo Persona desde el flujo de entrada y casting al tipo Persona
            Persona persona = (Persona) in.readObject();
            // Modificar las propiedades del objeto Persona si es necesario
            persona.setEdad(31);

            // Creación de un nuevo flujo de salida de bytes hacia el archivo
            FileOutputStream fileOut = new FileOutputStream(file);
            // Creación de un nuevo ObjectOutputStream que se conecta al nuevo flujo de salida de bytes
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // Escribir el objeto persona modificado en el nuevo flujo de salida
            out.writeObject(persona);

            // Cerrar el ObjectInputStream, el flujo de entrada de bytes, el ObjectOutputStream y el flujo de salida de bytes
            in.close();
            fileIn.close();
            out.close();
            fileOut.close();
        } catch (IOException | ClassNotFoundException e) {
            // Captura de excepciones de tipo IOException y ClassNotFoundException e imprime la traza de la pila
            e.printStackTrace();
        }
    }
}
