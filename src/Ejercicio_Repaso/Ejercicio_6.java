package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("introzca un numero entre 0-10");
             numero = sc.nextInt();
        }while(numero <0 || numero >10);



           for (int i=0; i<=20; i++){
               int resultado= numero*i;
               System.out.println(numero+ " * " +i+ "="+ resultado);
           }







    }
}
