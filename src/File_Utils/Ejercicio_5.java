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

        // Muestra todos los ficheros del directorio ejercicios

        // Especifica la ruta del directorio
        String directorioRuta = "C:\\Users\\amine\\IdeaProjects\\Acceso_Datos_1EV\\ejercicios";

        // Convierte la ruta en un objeto Path
        Path directorioPath = Paths.get(directorioRuta);

        // Verifica si el directorio existe
        if (Files.exists(directorioPath) && Files.isDirectory(directorioPath)) {
            try {
                // Utiliza Files.walk para listar los ficheros del directorio y sus subdirectorios
                Files.walkFileTree(directorioPath, EnumSet.noneOf(FileVisitOption.class), Integer.MAX_VALUE, new SimpleFileVisitor<Path>() {
                    @Override
                    public FileVisitResult visitFile(Path filePath, BasicFileAttributes attrs) throws IOException {
                        // Muestra el nombre del fichero
                        System.out.println(filePath.getFileName());
                        return FileVisitResult.CONTINUE;
                    }
                });
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.err.println("El directorio no existe o no es un directorio válido.");
        }

    }
}
