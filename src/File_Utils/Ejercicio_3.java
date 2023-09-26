package File_Utils;

import java.io.File;

public class Ejercicio_3 {
    public static void main(String[] args) {

        // Muestra por pantalla la longitud del fichero con nombre “ejercicio1”
        // Especifica el nombre del fichero
        String ficheroNombre = "C:\\Users\\amine\\IdeaProjects\\Acceso_Datos_1EV\\ejercicios\\ejercicio1"; // Asegúrarse de que coincida con el nombre del fichero que quieres medir

        // Crea un objeto File para representar el fichero
        File fichero = new File(ficheroNombre);

        // Verifica si el fichero existe
        if (fichero.exists()) {
            // Obtiene la longitud del fichero en bytes
            long longitud = fichero.length();

            // Muestra la longitud del fichero por pantalla
            System.out.println("La longitud del fichero '" + ficheroNombre + "' es " + longitud + " bytes.");

        } else {
            System.err.println("El fichero '" + ficheroNombre + "' no existe.");
        }




    }
}
