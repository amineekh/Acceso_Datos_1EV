package Exepciones;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        try {
            // Intentar leer un número entero del usuario
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("Número ingresado: " + numero);

        } catch (InputMismatchException e) {
            // Capturar y manejar la excepción InputMismatchException si ocurre
            System.out.println("Se produjo una excepción InputMismatchException.");
            System.out.println("Mensaje de la excepción: " + e.getMessage());

        }

        // El programa continúa después de manejar la excepción
        System.out.println("El programa continúa después de manejar la excepción.");
    }
}