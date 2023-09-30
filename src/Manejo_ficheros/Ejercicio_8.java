package Manejo_ficheros;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Ejercicio_8 {
    public static void main(String[] args) {
        //Ejercicio 8
        //Utiliza la librería FileUtils para mover dos ficheros

        // PASO 1: COGEMOS LAS RUTAS DE LOS FICHEROS   QUE QUEREMOS MOVER Y LOS ALMACENAMOS EN UNA VARIABLE
        // TAMBIEN SE PUEDEN CREAR LOS FICHEROS MEDIANTE EL CODIGO O MEDIANTE LA INTERFAZ GRAFICA
        String RutaOrigen = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NuevoDIR\\EJEMPLO-1.txt";
        String RutaOrigen2 = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NuevoDIR\\EJEMPLO-2.txt";

        //// PASO 2: ALMACENAMOS EN UNA VARIABLE LA RUUTA DESTINO DONDE SE VAN A MOVER LOS FICHEROS
        String RutaDestino = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects";

        // PASO 3: Creamos objetos File para representar los archivos de origen y el directorio de destino
        File file_ORIGEN = new File(RutaOrigen);
        File file_ORIGEN_2 = new File(RutaOrigen2);
        File file_DESTINO = new File(RutaDestino);

        // PASO 4: Intentamos mover los archivos al directorio de destino
        try {
            // Movemos el PRIMER archivo a la carpeta de destino CON LA SIGUIENTE CLASE:
            FileUtils.moveFileToDirectory(file_ORIGEN , file_DESTINO, true);
            System.out.println("Fichero movido");

            // Movemos el SEGUNDO archivo a la carpeta de destino CON LA SIGUIENTE CLASE:
            FileUtils.moveFileToDirectory( file_ORIGEN_2 ,file_DESTINO, true);
            System.out.println("Fichero movido");

        } catch (IOException ex) {
            // En caso de error, mostramos un mensaje de error y la traza de excepción.
            System.err.println("Error al mover el archivo");
            ex.printStackTrace();
        }
    }
}
