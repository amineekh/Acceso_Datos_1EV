package Exepciones;

public class Ejercicio_2 {
    public static void main(String[] args) {
        try {
            // Intentar dividir por cero, lo que provocará una ArithmeticException
            int resultado = 5 / 0;
            System.out.println("Resultado: " + resultado); // Esta línea nunca se ejecutará

        }
        // ArithmeticException e es la declaración de una variable
        // que nos permite acceder a la excepción que ocurrió para su posterior manejo.
        catch (ArithmeticException e) {
            // Manejar la excepción
            System.out.println("Se produjo una excepción aritmética: " + e.getMessage());

        }

        // El programa continúa después de manejar la excepción
        System.out.println("El programa continúa después de manejar la excepción.");
    }
}
