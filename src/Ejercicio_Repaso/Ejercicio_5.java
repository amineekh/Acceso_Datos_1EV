package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
            // Ejercicio 5. LA PATATA CALIENTE.
            //Realizar un juego para adivinar un número. Para ello:
            //Generar un número aleatorio a adivinar por el usuario (nrandom) entre 0-100. (No se muestra al usuario)
            //Pedir al usuario que introduzca un número por teclado.
            //En caso de no acertar:
            //Se repetirá el proceso y se le dará una pista al usuario:
            // es mayor / menor que el número introducido
            // El proceso termina cuando el usuario acierta.
            // Mostrar el número de intentos.

            // 1: Generar un número aleatorio a adivinar por el usuario entre 0-100 (No se muestra al usuario)
            // (int) para convertir el numero deciamal en un numero entero
            //  (Math.random()*100) para genar numeros aleaotrios de 0-100 por eso se multiplica *100
            int aleaotrio = (int) (Math.random()*100);

            // 2.  Crear un objeto Scanner para leer la entrada del usuario
            Scanner sc = new Scanner(System.in);
            // 3: Inicializar variables
            // declaramos una variable para ponder ingresar nosotros el numero
            int numero = 0;
            //decalaramos una variable para ir contando el numero de intentos
            int intento = 0;

            // 4: Bucle while - Continúa hasta que el número ingresado por el usuario es igual al número aleatorio
            while(aleaotrio != numero){

                // 5: Incrementar el contador de intentos en cada iteración
                intento++;

                // 7: Solicitar al usuario que introduzca un número y Leer el número ingresado por el usuario
                System.out.println("introduzca un numero");
                numero = sc.nextInt();

                // 8: Comparar el número ingresado con el número aleatorio y dar pistas en caso que sea mas
                // alto o mas bajo el numero
                if (aleaotrio < numero){
                    System.out.println("MAS BAJO !!!");
                }
                else if (aleaotrio > numero){
                    System.out.println("MAS ALTO !!!");
                }
                else {
                    // 9: Si el número es correcto, mostrar un mensaje de éxito y el número de intentos
                    System.out.println("El numero aleaotrioa era " + aleaotrio + "  ES CORECTO !!!");
                    System.out.println("el numero de intentos es: " + intento);
                }
            }

    }
}
