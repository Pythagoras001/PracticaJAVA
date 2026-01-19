package ConsumoApi;

/// PARA CONSUMIR LA API Y DESERIZARLA CON GSON TENERMOS Q IMPORTAR LA DEPENDENCIA ///

//    <dependency>
//        <groupId>com.google.code.gson</groupId>
//        <artifactId>gson</artifactId>
//        <version>2.10.1</version>
//    </dependency>


/// LOS PASOS PARA LA COMUNICACION DE UNA API SON ///

//Crear una URL
//Abrir una conexión HTTP
//Configurar el método (GET, POST…)
//Leer la respuesta (Stream)
//Convertir la respuesta a String
//Deserializar el JSON
//Navegar los datos


//public class ConsumoApi {
//
//    public static void main(String[] args) {
//
//        try {
//            // ================================
//            // 1️⃣ DEFINIR LA URL DE LA API
//            // ================================
//            // Esta URL apunta al recurso que queremos consumir
//            String apiUrl = "https://api.coindesk.com/v1/bpi/currentprice.json";
//
//            // Creamos un objeto URL a partir del String
//            URL url = new URL(apiUrl);
//
//            // ================================
//            // 2️⃣ ABRIR LA CONEXIÓN HTTP
//            // ================================
//            // openConnection() devuelve una conexión genérica
//            // la casteamos a HttpURLConnection para usar métodos HTTP
//            HttpURLConnection connection =
//                    (HttpURLConnection) url.openConnection();
//
//            // ================================
//            // 3️⃣ CONFIGURAR LA PETICIÓN
//            // ================================
//
//            // Indicamos el tipo de petición HTTP
//            connection.setRequestMethod("GET");
//
//            // ================================
//            // 4️⃣ VALIDAR EL CÓDIGO DE RESPUESTA
//            // ================================
//            int statusCode = connection.getResponseCode();
//
//            // HTTP 200 = OK
//            if (statusCode != 200) {
//                throw new RuntimeException(
//                        "Error HTTP: " + statusCode
//                );
//            }
//
//            // ================================
//            // 5️⃣ LEER LA RESPUESTA DE LA API
//            // ================================
//
//            // InputStreamReader lee bytes → caracteres
//            InputStreamReader isr =
//                    new InputStreamReader(connection.getInputStream());
//
//            // BufferedReader permite leer línea por línea
//            BufferedReader reader =
//                    new BufferedReader(isr);
//
//            StringBuilder response = new StringBuilder();
//            String line;
//
//            // Leemos toda la respuesta JSON
//            while ((line = reader.readLine()) != null) {
//                response.append(line);
//            }
//
//            // Cerramos el lector
//            reader.close();
//
//            // Guardamos el JSON completo como String
//            String jsonResponse = response.toString();
//
//            // ================================
//            // 6️⃣ DESERIALIZAR EL JSON
//            // ================================
//            // Gson convierte el JSON en objetos Java
//
//            Gson gson = new Gson();
//
//            // Convertimos el JSON al objeto raíz
//            ApiResponse apiResponse =
//                    gson.fromJson(jsonResponse, ApiResponse.class);

            // ================================
            // 8️⃣ CERRAR CONEXIÓN
            // ================================
//            connection.disconnect();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

/// SI QUEREMOS ACCEDER PARA DESERIALIZAR UN ELEMENTO EN ESPECIFICO ///

// OTRA ALTERNATIVA
//JsonArray dataArray =
//        JsonParser.parseString(jsonResponse)
//                .getAsJsonObject()
//                .getAsJsonArray("data");
//
//Producto[] productos =
//        new Gson().fromJson(dataArray, Producto[].class);


/*
===========================================================
APUNTE: Extraer y deserializar SOLO una parte de un JSON
usando Gson (sin clase contenedora)
===========================================================

JSON de ejemplo que devuelve una API:

{
  "status": "ok",
  "data": [
    { "id": 1, "name": "Producto A", "price": 10.5 },
    { "id": 2, "name": "Producto B", "price": 20.0 }
  ]
}

Objetivo:
- Ignorar "status"
- Acceder DIRECTAMENTE a la lista "data"
- Convertir esa lista en objetos Java
*/

//public class ApunteJsonParcial {
//
//    public static void main(String[] args) {

        // ===================================================
        // 1️⃣ RESPUESTA DE LA API (AÚN ES SOLO TEXTO)
        // ===================================================
//        String jsonResponse = """
//        {
//          "status": "ok",
//          "data": [
//            { "id": 1, "name": "Producto A", "price": 10.5 },
//            { "id": 2, "name": "Producto B", "price": 20.0 }
//          ]
//        }
//        """;

        // ===================================================
        // 2️⃣ PARSEAR EL STRING A UN ÁRBOL JSON
        // ===================================================
        // JsonParser lee el texto JSON y lo convierte
        // en una estructura navegable (árbol)
//        JsonElement element =
//                JsonParser.parseString(jsonResponse);

        // Sabemos que el JSON raíz empieza con { }
        // por eso lo convertimos a JsonObject
//      JsonObject root =
//                element.getAsJsonObject();

        /*
        En este punto, en memoria tenemos algo así:

        root
         ├─ "status" : "ok"
         └─ "data"   : JsonArray
        */

        // ===================================================
        // 3️⃣ EXTRAER SOLO EL ARREGLO "data"
        // ===================================================
        // Buscamos dentro del objeto raíz la clave "data"
        // y la obtenemos como JsonArray
//        JsonArray dataArray =
//                root.getAsJsonArray("data");

        /*
        Ahora dataArray representa SOLO esto:

        [
          { "id": 1, "name": "Producto A", "price": 10.5 },
          { "id": 2, "name": "Producto B", "price": 20.0 }
        ]
        */

        // ===================================================
        // 4️⃣ DESERIALIZAR LA LISTA A OBJETOS JAVA
        // ===================================================
//        Gson gson = new Gson();
//
//        // Definimos el tipo exacto que queremos:
//        // List<Producto>
//        Type listType =
//                new TypeToken<List<Producto>>() {}.getType();
//
//        // Convertimos el JsonArray directamente en una lista
//        List<Producto> productos =
//                gson.fromJson(dataArray, listType);
//
//        // ===================================================
//        // 5️⃣ USAR LOS DATOS YA DESERIALIZADOS
//        // ===================================================
//        for (Producto p : productos) {
//            System.out.println(
//                    p.id + " - " + p.name + " - $" + p.price
//            );
//        }
//    }
//}

/*
===========================================================
CLASE DEL ELEMENTO DE LA LISTA
===========================================================

Regla:
- Cada objeto dentro del array JSON → una clase Java
- Los nombres deben coincidir con el JSON
*/

//class Producto {
//    public int id;
//    public String name;
//    public double price;
//}
