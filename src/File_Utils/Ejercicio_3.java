package File_Utils;

import java.io.File;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //Ejercicio 3:
        // Muestra por pantalla la longitud del fichero con nombre “ejercicio1”

        // 1. Especifica ruta y el nombre del fichero
        String ficheroNombre = "C:\\Users\\amine\\IdeaProjects\\Acceso_Datos_1EV\\ejercicios\\ejercicio1"; // Asegúrarse de que coincida con el nombre del fichero que quieres medir

        // 2. Crea un objeto File para representar el fichero
        File fichero = new File(ficheroNombre);

        // 3. Verifica si el fichero existe
        if (fichero.exists()) {
            // 4. Obtiene la longitud del fichero en bytes
            long longitud = fichero.length();

            // 5. Muestra la longitud del fichero por pantalla
            System.out.println("La longitud del fichero '" + ficheroNombre + "' es " + longitud + " bytes.");

        } else {
            // 6. Si el fichero no existe, imprime un mensaje de error
            System.err.println("El fichero '" + ficheroNombre + "' no existe.");
        }

    }
}
