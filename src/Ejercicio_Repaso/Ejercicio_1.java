package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            String nombre ="";
            System.out.printf("Introduzca el nombre");
            nombre = sc.next();
             System.out.println("introduzca la edad");
             int edad= sc.nextInt();

            System.out.println("el nombre es :" + nombre );
            System.out.println("el edad es : " +edad);


    }

}
