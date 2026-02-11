import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String ruta = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] partes = linea.split("\\|");

                String nombre = partes[0];
                String edad = partes[1];
                String pais = partes[2];

                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("País: " + pais);
                System.out.println("-----------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}