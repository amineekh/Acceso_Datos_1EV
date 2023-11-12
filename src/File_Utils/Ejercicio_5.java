package File_Utils;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;

public class Ejercicio_5 {
    public static void main(String[] args) {
        //Ejercicio 5:
        // Muestra todos los ficheros del directorio ejercicios

        // 1. Especificar la ruta del directorio y lo guardamos en una variable
        String directorioRuta = "C:\\Users\\amine\\IdeaProjects\\Acceso_Datos_1EV\\ejercicios";

        // 2. Convierte la ruta en un objeto Path
        Path directorioPath = Paths.get(directorioRuta);

        // 3. Verifica si el directorio existe y es un directorio válido
        if (Files.exists(directorioPath) && Files.isDirectory(directorioPath)) {
            try {
                //4. Utiliza Files.walk para listar los ficheros del directorio y sus subdirectorios
                Files.walkFileTree(directorioPath, EnumSet.noneOf(FileVisitOption.class), Integer.MAX_VALUE, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path filePath, BasicFileAttributes attrs) throws IOException {
                        // 5. Muestra el nombre del fichero
                        System.out.println(filePath.getFileName());
                        return FileVisitResult.CONTINUE;
                    }
                });
            } catch (IOException e) {
                // 6. Maneja excepciones de entrada/salida (IOException)
                e.printStackTrace();
            }
        } else {
            // 7. Si el directorio no existe o no es válido, imprime un mensaje de error
            System.err.println("El directorio no existe o no es un directorio válido.");
        }

    }
}
