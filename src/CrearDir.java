import java.io.File;

public class CrearDir {
    public static void main(String[] args) {
        File d = new File("NUEVODIR"); // directorio que creo
        File f1 = new File(d, "FICHERO1.txt");
        File f2 = new File(d, "FICHERO2.txt");

        System.out.println();


    }
}
