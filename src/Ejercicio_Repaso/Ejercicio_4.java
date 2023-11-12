package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        // Ejercicio 4. NOTAS DE CLASE.
        // Pedir una nota de 0 a 10 y mostrarla de la forma:
        // Insuficiente, Sucifiente, Bien, Notable y Sobresaliente.
        // Usar la escructura “Switch case"

        // 1: Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // 2: Solicitar al usuario que introduzca su nota
        System.out.println("introduzca tu nota:");
        int  nota = sc.nextInt(); // 3: Leer la nota ingresada por el usuario

        // 4: Utilizar un switch para evaluar la nota y mostrar un mensaje correspondiente
        switch (nota){

            case 0:
                System.out.println("insuficiente");
                break;
            case 1:
                System.out.println("insuficiente");
                break;
            case 2:
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
            // 5: en caso de que el usuario no introduzca una nota entre el (1-10) , le salga un mensaje de error
            default:
                System.out.println("Nota no válida");
                break;
        }


    }
}
