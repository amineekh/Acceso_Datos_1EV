package Ejercicio_Repaso;
import java.util.ArrayList;
public class Ejercicio_8 {
    public static void main(String[] args) {

        // Ejercicio 8. ArrayList
        //Crear ArrayList con varias marcas de coches añadir sus valores.
        //Crear una función llamada pares a la que le pasamos el array y nos muestra solamente los valores de las
        //posiciones pares.
        //Ejemplo:
        //Los valores de las posiciones pares del array [Volvo, BMW, Ford, Mazda]son:
        //Posicion: 0- Valor: Volvo
        //Posicion: 2- Valor: Ford

        // Crear un ArrayList de String para almacenar marcas de coches
        ArrayList<String> marcasDeCoches = new ArrayList<>();

        // Agregar valores al ArrayList
        marcasDeCoches.add("Volvo");
        marcasDeCoches.add("BMW");
        marcasDeCoches.add("Ford");
        marcasDeCoches.add("Mazda");
        // Puedes agregar más marcas de coches si lo deseas

        // Llamar a la función pares para mostrar los valores en posiciones pares
        pares(marcasDeCoches);
    }

    public static void pares(ArrayList<String> lista) {
        System.out.println("Los valores de las posiciones pares del array son:");

        // Recorrer la lista y mostrar los valores en posiciones pares
        for (int i = 0; i < lista.size(); i++) {
            if (i % 2 == 0) { // Verificar si la posición es par
                System.out.println("Posicion: " + i + " - Valor: " + lista.get(i));

            }
        }
    }
}
