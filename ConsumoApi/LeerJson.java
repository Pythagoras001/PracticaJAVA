package ConsumoApi;

///*
//===========================================================
//APUNTE: Leer un archivo JSON desde el proyecto
//===========================================================
//*/
//
//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;
//
//import java.io.FileReader;
//import java.lang.reflect.Type;
//import java.util.List;
//
//public class LeerJsonArchivo {
//
//    public static void main(String[] args) {
//
//        try {
//            // ===================================================
//            // 1️⃣ RUTA DEL ARCHIVO JSON
//            // ===================================================
//            // Si está en src/main/resources
//            String path = "src/main/resources/productos.json";
//
//            // ===================================================
//            // 2️⃣ ABRIR EL ARCHIVO
//            // ===================================================
//            // FileReader lee archivos de texto
//            FileReader reader = new FileReader(path);
//
//            // ===================================================
//            // 3️⃣ DEFINIR EL TIPO DE DATOS
//            // ===================================================
//            // Gson necesita saber que es List<Producto>
//            Type listType =
//                    new TypeToken<List<Producto>>() {}.getType();
//
//            // ===================================================
//            // 4️⃣ DESERIALIZAR EL JSON
//            // ===================================================
//            Gson gson = new Gson();
//
//            List<Producto> productos =
//                    gson.fromJson(reader, listType);
//
//            // ===================================================
//            // 5️⃣ USAR LOS DATOS
//            // ===================================================
//            for (Producto p : productos) {
//                System.out.println(p.name + " - $" + p.price);
//            }
//
//            // ===================================================
//            // 6️⃣ CERRAR EL ARCHIVO
//            // ===================================================
//            reader.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
