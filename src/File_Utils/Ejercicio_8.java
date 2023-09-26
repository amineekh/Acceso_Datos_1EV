package File_Utils;

import java.io.File;

public class Ejercicio_8 {
    public static void main(String[] args) {

        //Elimina nuevamente el fichero llamado fichero1.
        //  ¿Has podido?
        // No porque el fichero ya no existe porque lo borramos anteriormente


        // Especifica el nombre del directorio
        String directorioNombre = "ejercicios";
        // Especifica el nombre del fichero a eliminar
        String ficheroNombre = "ejercicio1.txt";
        // Construye la ruta completa al fichero
        String rutaCompleta = "C:\\Users\\amine\\IdeaProjects\\Acceso_Datos_1EV\\ejercicios\\ejercicio1";

        // Crea un objeto File para representar el fichero
        File fichero = new File(rutaCompleta);

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

    }
}
