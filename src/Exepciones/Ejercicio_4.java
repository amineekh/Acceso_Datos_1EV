package Exepciones;
import java.util.Scanner;



public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Solicitamos al usuario que ingrese una nota
        System.out.print("Ingrese su nota (0-10): ");
        int nota = scanner.nextInt();

        try {
            // Paso 2: Intentamos validar la nota utilizando la función validarNota
            validarNota(nota);

            // Paso 3: Si la nota es válida, obtenemos la calificación correspondiente y la mostramos
            System.out.println("La nota ingresada es: " + obtenerCalificacion(nota));
        } catch (NotaInvalidaException e) {
            // Paso 4: Si se lanza una NotaInvalidaException, capturamos la excepción y mostramos un mensaje de error
            System.out.println("Se generó una excepción: " + e.getMessage());
        } finally {
            // Paso 5: Cerramos el scanner para liberar recursos
            scanner.close();

        }
    }

    // Paso 6: Definimos una función para obtener la calificación a partir de la nota
    public static String obtenerCalificacion(int nota) {
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "Insuficiente";
            case 5:
                return "Suficiente";
            case 6:
                return "Bien";
            case 7:
            case 8:
            case 9:
                return "Notable";
            case 10:
                return "Sobresaliente";
            default:
                return "Nota fuera de rango";
        }
    }

    // Paso 7: Definimos una función para validar la nota y lanzar una excepción si es inválida
    public static void validarNota(int nota) throws NotaInvalidaException {
        if (nota < 0 || nota > 10) {
            throw new NotaInvalidaException("La nota debe estar en el rango de 0 a 10.");
        }
    }
}

// Paso 8: Definimos una excepción personalizada llamada NotaInvalidaException
class NotaInvalidaException extends Exception {
    public NotaInvalidaException(String mensaje) {
        super(mensaje);
    }

}