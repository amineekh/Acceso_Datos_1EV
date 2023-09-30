package Exepciones;

import java.util.Scanner;

public class Ejercicio_6_2 {
    public static void main(String[] args) {
        //EJERCICIO 6.
        //UƟliza, al menos en los ejercicios 2 y 3, algunos métodos propios de las excepciones
        //(printStackTrace(), etc) y compara los disƟntos mensajes generados.

        Scanner scanner = new Scanner(System.in);
        // ejercicio 2
        try {
            // Paso 1: Intentamos realizar una división por cero, lo que provoca una ArithmeticException
            int resultado = 5 / 0; // Esta línea provocará la excepción

            // La siguiente línea nunca se ejecutará debido a la excepción
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Paso 2: Capturamos la excepción ArithmeticException
            System.out.println("Se produjo una excepción aritmética: " + e.getMessage());

            // Paso 3: Imprimimos el stack trace completo de la excepción para depuración
            System.out.println("Stack Trace de la excepción:");
            e.printStackTrace();
        }

        // Paso 4: El programa continúa después de manejar la excepción
        System.out.println("El programa continúa después de manejar la excepción.");
    }
}




