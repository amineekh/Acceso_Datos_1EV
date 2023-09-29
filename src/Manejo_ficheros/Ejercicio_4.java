package Manejo_ficheros;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;

public class Ejercicio_4 {
    public static void main(String[] args) {

        //Tomando el directorio actual como referencia, muestra sus datos tal y como
        //se muestra en el ejemplo siguiente:

        System.out.println("informacion del fichero");

        File directorio_Actual = new File(".");

        // NOMBRE FICHERO
        System.out.println("NOMBRE: "+directorio_Actual.getName());


        // RUTA NORMAL
        System.out.println("RUTA: "+directorio_Actual.getPath());

        // RUTA ABSOLUTA
        System.out.println("RUTA ABSOLUTA: "+ directorio_Actual.getAbsolutePath());

        // SI SE PUEDE LEER
        System.out.println("SE PUEDE LEER: "+directorio_Actual. canRead());

        // SI SE PUEDE ESCRIBIR
        File fichero3 = new File("ficheros");
        System.out.println("SE PUEDE ESCRIBIR: "+directorio_Actual.canWrite());

        // TAMAÑO , BYTES
        System.out.println("TAMAÑO "+ directorio_Actual.length());

        //ES UN DIRECTORIO
        System.out.println("ES UN DIRECTORIO: "+ directorio_Actual.isDirectory());

        //ES UN FICHERO
        System.out.println("ES UN FICHERO: "+ directorio_Actual.isFile());

        //NOMBRE DEL DIRECTORIO PADRE
        System.out.println("NOMBRE DEL DIRECTORIO PADRE: " +  directorio_Actual.getParent());

    }
}
