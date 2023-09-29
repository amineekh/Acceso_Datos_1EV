package Manejo_ficheros;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Ejercicio_8 {
    public static void main(String[] args) {

        //Ejercicio 8
        //Utiliza la librería FileUtils para mover dos ficheros

        String RutaOrigen = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NuevoDIR\\EJEMPLO-1.txt";
        String RutaOrigen2 = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects\\Acceso_Datos_1EV\\NuevoDIR\\EJEMPLO-2.txt";

        String RutaDestino = "C:\\Users\\MohamedAmineElkhayya\\IdeaProjects";


        File file_ORIGEN = new File(RutaOrigen);
        File file_ORIGEN_2 = new File(RutaOrigen2);
        File file_DESTINO = new File(RutaDestino);


        try {
            FileUtils.moveFileToDirectory(file_ORIGEN , file_DESTINO, true);
            System.out.println("Fichero movido");

            FileUtils.moveFileToDirectory( file_ORIGEN_2 ,file_DESTINO, true);
            System.out.println("Fichero movido");
        } catch (IOException ex) {
            System.err.println("Error al mover el archivo");
            ex.printStackTrace();

        }




    }
}
