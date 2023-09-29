package Manejo_ficheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio_7 {
    public static void main(String[] args) {

        // Ejercicio 7
        //Utiliza la librería FileUtils para copiar dos ficheros

        String RutaOrigen = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NuevoDIR\\EJEMPLO-1.txt";
        String RutaDestino = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV";

        File file_ORIGEN = new File(RutaOrigen);
        File file_DESTINO = new File(RutaDestino);


        try {
            FileUtils.copyFileToDirectory(file_ORIGEN, file_DESTINO);
            System.out.println("Fichero copiado");
        } catch (IOException ex) {
            System.err.println("Error al copiar el archivo");
            ex.printStackTrace();

        }
    }
}
