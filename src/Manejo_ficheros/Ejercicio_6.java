package Manejo_ficheros;
import java.io.File;
public class Ejercicio_6 {
        public static void main(String[] args) {
            //EJERCICIO 6:
            // Dado un directorio, recorre cada elemento comparando su nombre con alguno de los argumentos.
            //Si encuentra una coincidencia, muestra el tipo de File que es (Fichero o directorio).

                // Paso 1: Verificar si se proporcionaron suficientes argumentos
                if (args.length < 2) {
                        System.out.println("Uso: java Main <directorio> <nombre1> <nombre2> ...");
                        return;
                }

                // Paso 2: Obtener el directorio base a partir del primer argumento
                String directorioBase = args[0];
                File directorio = new File(directorioBase);

                // Paso 3: Verificar si el directorio existe y es válido
                if (!directorio.exists() || !directorio.isDirectory()) {
                        System.err.println("El directorio especificado no existe o no es un directorio válido.");
                        return;
                }

                // Paso 4: Iterar a través de los argumentos a partir del segundo (índice 1)
                for (int i = 1; i < args.length; i++) {
                        String nombreBuscado = args[i];
                        buscarYMostrar(directorio, nombreBuscado);
                }
        }

        public static void buscarYMostrar(File directorio, String nombreBuscado) {
                // Paso 5: Obtener la lista de archivos y directorios en el directorio
                File[] elementos = directorio.listFiles();
                // Paso 6: Verificar si la lista de elementos no es nula
                if (elementos != null) {
                        for (File elemento : elementos) {
                                // Paso 7: Comparar el nombre del elemento con el nombre buscado
                                if (elemento.getName().equals(nombreBuscado)) {
                                        // Paso 8: Mostrar que es un fichero si el elemento es un archivo
                                        if (elemento.isFile()) {
                                                System.out.println("Fichero: " + nombreBuscado);
                                        }
                                        // Paso 9: Mostrar que es un directorio si el elemento es una carpeta
                                        else if (elemento.isDirectory()) {
                                                System.out.println("Directorio: " + nombreBuscado);
                                        }
                                }
                                // Paso 10: Si el elemento es un directorio, buscar recursivamente en ese directorio
                                if (elemento.isDirectory()) {
                                        buscarYMostrar(elemento, nombreBuscado);
                                }
                        }
                }
        }
}
