package Exepciones;
public class Ejercicio_5 {
    public static void main(String[] args) {
        // EJERCICIO 5.
        // Realiza un programa que realice una llamada a una función B que a su vez realice una llamada
        //a una función C. InvesƟga la propagación de una excepción que generes tú mism@ por los
        //disƟntos niveles. Comprueba qué ocurre cuando la tratas en cada nivel o si la propagas con
        //trhows.

        try {
            funcionB(); // Paso 1: Llamamos a la función B desde el nivel más alto (main)
        } catch (MiExcepcion e) {
            // Paso 6: Capturamos la excepción en el nivel más alto (main) y la manejamos
            System.out.println("Excepción capturada en el nivel más alto:");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
        }
    }

    public static void funcionB() throws MiExcepcion {
        try {
            funcionC(); // Paso 2: Llamamos a la función C desde la función B
        } catch (MiExcepcion e) {
            // Paso 4: Capturamos la excepción en el nivel intermedio (función B) y la propagamos
            System.out.println("Excepción capturada en el nivel intermedio:");
            System.out.println("Mensaje de la excepción: " + e.getMessage());
            throw e; // Paso 5: Propagamos la excepción al nivel superior (main)
        }
    }

    public static void funcionC() throws MiExcepcion {
        // Paso 3: Generamos y lanzamos una excepción personalizada desde la función C
        throw new MiExcepcion("Esta es una excepción personalizada desde la función C");
    }
}

class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}