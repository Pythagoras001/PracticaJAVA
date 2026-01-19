package ConsumoApi;

///*
//===========================================================
//APUNTE: Escribir un archivo JSON en Java
//===========================================================
//*/
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.List;
//
//public class EscribirJsonArchivo {
//
//    public static void main(String[] args) {
//
//        try {
//            // ===================================================
//            // 1️⃣ CREAR DATOS EN JAVA
//            // ===================================================
//            List<Producto> productos = new ArrayList<>();
//
//            productos.add(new Producto(1, "Producto A", 10.5));
//            productos.add(new Producto(2, "Producto B", 20.0));
//
//            // ===================================================
//            // 2️⃣ CONFIGURAR GSON
//            // ===================================================
//            // setPrettyPrinting() → JSON bonito (indentado)
//            Gson gson = new GsonBuilder()
//                    .setPrettyPrinting()
//                    .create();
//
//            // ===================================================
//            // 3️⃣ RUTA DEL ARCHIVO A CREAR
//            // ===================================================
//            String path = "src/main/resources/salida.json";
//
//            // ===================================================
//            // 4️⃣ ESCRIBIR EL JSON
//            // ===================================================
//            FileWriter writer = new FileWriter(path);
//
//            gson.toJson(productos, writer);
//
//            // ===================================================
//            // 5️⃣ CERRAR ARCHIVO
//            // ===================================================
//            writer.close();
//
//            System.out.println("Archivo JSON creado correctamente");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
