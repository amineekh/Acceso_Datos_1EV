package Exepciones;
public class Ejercicio_1 {
    public static void main(String[] args) {
        //EJERCICIO 1.
        //Crear una matriz de 2 filas y 3 columnas. Rellenar con la suma de la posición de la fila con la de
        //la columna todas las filas y columnas excepto la última columna.
        //¿Qué excepción ocurre? Si intentas visualizar la posición [2][3] ¿qué ocurre? ¿Cómo lo
        //solucionarías?

        // Definir una matriz de 2 filas y 3 columnas
        int[][] matriz = new int[2][3];

        // Llenar la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                // Sumar el índice de la fila con el índice de la columna
                matriz[fila][columna] = fila + columna;
            }
        }

        // Imprimir la matriz
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }

        // Intentar visualizar la posición [2][3]
        try {

            System.out.println("Valor en la posición [2][3]: " + matriz[2][3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción: " + e.getMessage());
            System.out.println("Intentaste acceder a una posición fuera de los límites de la matriz.");
        }
    }

}
