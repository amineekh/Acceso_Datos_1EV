package Ejercicio_Repaso;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {

        // Declarar un array para almacenar 5 números
        int[] numeros = new int[5];

        // Leer 5 números por teclado y guardarlos en el array
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();

        // Mostrar los números en el mismo orden introducido
        System.out.println("Los números introducidos son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);

        }

        // Calcular y mostrar la media de los valores en el array
        double media = calcularMediaArray(numeros);
        System.out.println("La media de los números es: " + media);
    }

    // Función para calcular la media de los valores en el array
    public static double calcularMediaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }

        // Dividir la suma por la cantidad de elementos para obtener la media
        return (double) suma / array.length;
    }
}
