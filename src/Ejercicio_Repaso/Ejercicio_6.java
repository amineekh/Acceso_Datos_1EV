package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        // Ejercicio 6. TABLA DE MULTIPLICAR
        // pedir un número y chequear tenga un valor entre 0 y 10.
        // Mostrar la tabla de multiplicar de ese número desde el 1 al 20.

        // 1.  Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        int numero; // 2. Declarar una variable int para almacenar el número ingresado por el usuario

        // 3. Utilizar un bucle do-while para solicitar al usuario que ingrese un número hasta que cumpla con la condición
        do {
            System.out.println("introzca un numero entre 0-10");
             numero = sc.nextInt();
        }while(numero <0 || numero >10);

        // 4. Utilizar un bucle for para generar la tabla de multiplicar desde 1 hasta 20
           for (int i=0; i<=20; i++){
               // 5. Calcular el resultado de la multiplicación
               int resultado= numero*i;
               // 6. mostrat la operacion y el resultado
               System.out.println(numero+ " * " +i+ "="+ resultado);
           }

    }
}
