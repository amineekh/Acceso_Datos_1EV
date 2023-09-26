package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

            // (int) para convertir el numero deciamal en un numero entero
            //  (Math.random()*100) para genar numeros aleaotrios de 0-100 por eso se multiplica *100
            int aleaotrio = (int) (Math.random()*100);

            Scanner sc = new Scanner(System.in);
            int numero = 0;
            int intento = 0;


            while(aleaotrio != numero){

                intento++;

                System.out.println("introduzca un numero");
                numero = sc.nextInt();

                if (aleaotrio < numero){
                    System.out.println("MAS BAJO !!!");
                }
                else if (aleaotrio > numero){
                    System.out.println("MAS ALTO !!!");
                }
                else {
                    System.out.println("El numero aleaotrioa era " + aleaotrio + "  ES CORECTO !!!");
                    System.out.println("el numero de intentos es: " + intento);
                }
            }

    }
}
