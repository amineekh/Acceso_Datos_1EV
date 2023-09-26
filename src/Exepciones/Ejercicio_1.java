package Exepciones;

public class Ejercicio_1 {
    public static void main(String[] args) {
        // Definir una matriz de 2 filas y 3 columnas
        int[][] matriz = new int[2][3];

        // Rellenar la matriz con la suma de la posición de la fila y columna
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                // Calcular la suma de la fila y la columna, excepto la última columna
                if (columna < 2) {
                    matriz[fila][columna] = fila + columna;
                }
            }
        }

        // Mostrar la matriz
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println(); // Saltar a la siguiente fila
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
