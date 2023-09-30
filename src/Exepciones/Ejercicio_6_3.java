package Exepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio_6_3 {
    public static void main(String[] args) {
        //EJERCICIO 6.
        //UƟliza, al menos en los ejercicios 2 y 3, algunos métodos propios de las excepciones
        //(printStackTrace(), etc) y compara los disƟntos mensajes generados.

        // Paso 1: Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        try {
            // Paso 2: Intentamos leer un número entero del usuario
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt(); // Si el usuario ingresa un valor no entero, se lanza InputMismatchException
            System.out.println("Número ingresado: " + numero);
        } catch (InputMismatchException e) {
            // Paso 3: Capturamos la excepción InputMismatchException
            System.out.println("Se produjo una excepción InputMismatchException.");

            // Paso 4: Mostramos el mensaje de la excepción
            System.out.println("Mensaje de la excepción: " + e.getMessage());

            // Paso 5: Imprimimos el stack trace completo de la excepción para depuración
            System.out.println("Stack Trace de la excepción:");
            e.printStackTrace();
        }
        // Paso 6: El programa continúa después de manejar la excepción
        System.out.println("El programa continúa después de manejar la excepción.");
    }
}

