package Ejercicios.SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class LongestRepeating {
    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static Integer characterReplacement(String s, Integer k) {
        
        // Creamos los estados
        Map<Character, Integer> estados = new HashMap<>();

        // Creamos el puntero de inicio
        int ini = 0;

        // Creamos el contador maximo
        int maxx = 0;

        char caracter;

        // Creamos el slicing window
        for (int fin = 0; fin < s.length(); fin++) {
            // Registramos el movimiento derecho
            caracter = s.charAt(fin);
            estados.put(caracter, estados.getOrDefault(caracter, 0) + 1);

            // Reviso el estado de valides de la subcadena
            while (Collections.max(estados.values()) + k < fin - ini + 1) {
                // si no es validos movemos el puntero inicial 
                caracter = s.charAt(ini);
                estados.put(caracter, estados.get(caracter) - 1);

                // Si no tenemos mas el caracter lo borramos del mapa de estados
                if (estados.get(caracter) == 0) estados.remove(caracter);

                ini ++;
            }

            maxx = Math.max(maxx, fin - ini + 1);
        }
        return maxx;
    }
}
