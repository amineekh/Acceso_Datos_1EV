package File_Utils;

import java.io.File;

public class Ejercicio_1 {
    public static void main(String[] args) {

        // Crea un directorio llamado ”ejercicios”
        File d= new File("ejercicios");

        // comprobar si el directorio ya existe
        if (!d.exists()){
            // Si no existe, intentar crearlo
            if (d.mkdir()) {
                System.out.println("el directorio ha sido creado correctamente");
            }
            else {
                System.err.println("No se pudo crear el directorio.");
                return; // Salir del programa si no se pudo crear el directorio
            }



        }
        else {
            System.out.println("el directorio ya existe ");
        }

    }
}

