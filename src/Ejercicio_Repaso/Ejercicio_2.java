package Ejercicio_Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        //Ejercicio 2.
        //Realizar un programa que pida tres números y los muestre ordenados

        // 1. Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);


        //2. Indicamos al usuario que introduzca los numeros
        // Y utilizamos la clase Scanner para leer un entero desde la entrada y asignarlo a la variable correspondiente
        System.out.println("introdzca  primer numeros");
        int num1= sc.nextInt();
        System.out.println("introdzca segundo numero ");
        int num2= sc.nextInt();
        System.out.println("introdzca tercer numero");
        int num3= sc.nextInt();

        // 3. Declaramos un array llamado numeros, almacenamos los numeros en el arrray
        int[] numeros=  {num1, num2, num3};

        // 4. ordenamos en forma ascendente los elementos del array numeros, con el metodo sort.
        Arrays.sort(numeros);

        // 5. imprimimos los numeros ordendos con un bucle for
        System.out.println("los numeros ordenados:");
        for (int numero: numeros) {
            System.out.println(numero);
        }


    }
}