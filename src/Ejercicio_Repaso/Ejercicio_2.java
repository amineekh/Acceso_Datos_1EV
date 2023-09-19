package Ejercicio_Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("introdzca  primer numeros");
        int num1= sc.nextInt();
        System.out.println("introdzca segundo numero ");
        int num2= sc.nextInt();
        System.out.println("introdzca tercer numero");
        int num3= sc.nextInt();


        int[] numeros=  {num1, num2, num3};

        Arrays.sort(numeros);

        System.out.println("los numeros ordenados:");
        for (int numero: numeros) {
            System.out.println(numero);
        }


    }
}
