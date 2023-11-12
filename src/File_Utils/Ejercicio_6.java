package File_Utils;


import java.io.File;

public class Ejercicio_6 {
    public static void main(String[] args) {
        // Ejercicio 6
        // Elimina el fichero llamado ejercicio1

        // Especifica el nombre del directorio
        // String directorioNombre = "ejercicios";
        // Especifica el nombre del fichero a eliminar
        // String ficheroNombre = "ejercicio1.txt";

        // 1. Construye la ruta completa al fichero
        String rutaCompleta = "C:\\Users\\amine\\IdeaProjects\\Acceso_Datos_1EV\\ejercicios\\ejercicio1";

        // 2. Crea un objeto File para representar el fichero
        File fichero = new File(rutaCompleta);

        // 3. Verifica si el fichero existe
        if (fichero.exists()) {
            // 4. Intenta eliminar el fichero
            if (fichero.delete()) {
                System.out.println("Fichero eliminado con éxito.");
            } else {
                // 5. Si no se pudo eliminar el fichero, imprime un mensaje de error
                System.err.println("No se pudo eliminar el fichero.");
            }
        } else {
            // 6. Si el fichero no existe en la ruta especificada, imprime un mensaje de error
            System.err.println("El fichero no existe en la ruta especificada.");
        }





    }
}
