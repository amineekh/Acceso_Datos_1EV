package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca tu nota:");
        int  nota = sc.nextInt();

        switch (nota){

            case 0:
                System.out.println("insuficiente");
                break;
            case 1:
                System.out.println("insuficiente");
                break;
            case 3:
                System.out.println("insuficiente");
                break;
            case 4:
                System.out.println("insuficiente");
                break;
            case 5:
                System.out.println("suficiente");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 7:
                System.out.println("bien");
                break;
            case 8:
                System.out.println("notable");
                break;
            case 9:
                System.out.println("notable");
                break;
            case 10:
                System.out.println("sobresaliente");
                break;
        }


    }
}
