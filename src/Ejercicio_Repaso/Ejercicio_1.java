package Ejercicio_Repaso;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {

        //Ejercicio 1.
        //Hacer de programa que realiza entrada y salida por consola con la clase Scanner del siguiente modo:
        //- Pide el nombre del usuario y lo registra
        //- Pide la edad del usuario y lo registra
        //- Muestra un mensaje de buenos días con el nombre y la edad.

        // 1. Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
            // 2. se declara una variable String llamada nombre para guardar el dato de enntrada que pone el usuario
            String nombre ="";
            System.out.printf("Introduzca el nombre: "); // 3. indiacamos al usuario que introduzca su nombre
            nombre = sc.next(); // 4. Leer la entrada del usuario como una cadena
            System.out.println("introduzca la edad: "); // 5. indicamos al usuario que introduzca la edad
            // 6. utilizamos la clase Scanner para leer un entero desde la entrada estándar y asignarlo a la variable edad.
            int edad= sc.nextInt();

            // 7. Imprimir el nombre y la edad utilizando el nombre ingresado y la edad.
            System.out.println("El nombre es :" + nombre );
            System.out.println("La edad es : " +edad);


    }

}
