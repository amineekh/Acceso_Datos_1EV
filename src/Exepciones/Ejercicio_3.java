package Exepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        //EJERCICIO 3.
        //Genera una excepción del Ɵpo java.uƟl. InputMismatchExcepƟon. Posteriormente, trata la excepción con un try catch.

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Intentar leer un número ENTERO del usuario
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {
            //SI no mete un numero entero le lanza el mensaje de la exepcion
            // Capturar y manejar la excepción InputMismatchException si ocurre
            System.out.println("Se produjo una excepción InputMismatchException.");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        }
        // El programa continúa después de manejar la excepción
        System.out.println("El programa continúa después de manejar la excepción.");
    }
}