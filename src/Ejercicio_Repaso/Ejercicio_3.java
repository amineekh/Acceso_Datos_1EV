package Ejercicio_Repaso;

import javax.swing.JOptionPane;
public class Ejercicio_3 {
    public static void main(String[] args) {

        //Ejercicio 3. JOptionPane
        //Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayúscula. Utiliza JOptionPane,
        //una clase de java que muestra cuadros de diálogo y que podemos utilizar como alternativa a la clase Scanner.
        //Esta clase puede utilizarse también para la entrada de datos. Para poder utilizar esta clase, debemos observar la
        //API de java y comprobar las características de la esta clase.


        // 1: Utilizar JOptionPane para obtener un carácter del usuario
        String input = JOptionPane.showInputDialog("Ingrese un carácter:");

        // 2: Obtener el primer carácter de la cadena introducida
        char caracter = input.charAt(0);

        // 3: Comprobar si el carácter es una letra mayúscula
        if (Character.isUpperCase(caracter)) {
            // 4: Mostrar un mensaje si es una letra mayúscula
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula.");
        } else {
            // 5: Mostrar un mensaje si no es una letra mayúscula
            JOptionPane.showMessageDialog(null, "No es una letra mayúscula.");
        }
    }
}
