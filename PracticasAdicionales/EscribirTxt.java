// No borra el anterior
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("datos.txt", true)) {

            writer.write("Pedro|22|Argentina\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Borra el anterior
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("datos.txt")) {

            writer.write("Juan|25|Colombia\n");
            writer.write("Maria|30|Mexico\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}