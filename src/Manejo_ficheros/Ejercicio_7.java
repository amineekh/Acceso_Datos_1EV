package Manejo_ficheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio_7 {
    public static void main(String[] args) {

        // Ejercicio 7
        //Utiliza la librería FileUtils para copiar dos ficheros



        // PASO 1: COGEMOS LAS RUTAS DE LOS FICHEROS   QUE QUEREMOS COPIAR Y LOS ALMACENAMOS EN UNA VARIABLE
        // TAMBIEN SE PUEDEN CREAR LOS FICHEROS MEDIANTE EL CODIGO O MEDIANTE LA INTERFAZ GRAFICA
        String RutaOrigen = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NuevoDIR\\EJEMPLO-1.txt";

        //// PASO 2: ALMACENAMOS EN UNA VARIABLE LA RUUTA DESTINO DONDE SE VAN A COPIAR LOS FICHEROS
        String RutaDestino = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV";

        // PASO 3: Creamos objetos File para representar los archivos de origen y el directorio de destino
        File file_ORIGEN = new File(RutaOrigen);
        File file_DESTINO = new File(RutaDestino);

        // PASO 4: Intentamos mover los archivos al directorio de destino
        try {
            // Copiamos archivo a la carpeta de destino CON LA SIGUIENTE CLASE:
            // Primero ponemos fichero que copiamos y después la variable donde esta almacenada ruta del destino
            FileUtils.copyFileToDirectory(file_ORIGEN, file_DESTINO);
            System.out.println("Fichero copiado");

        } catch (IOException ex) {
            // En caso de error, mostramos un mensaje de error y la traza de excepción.
            System.err.println("Error al copiar el archivo");
            ex.printStackTrace();

        }
    }
}
