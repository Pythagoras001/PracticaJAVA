package Ejercicios.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeat("substring"));
    }

    public static Integer longestSubstringWithoutRepeat(String s) {

        // Creamos el dicc de estados
        Map<Character, Integer> estados = new HashMap<>();
        // Creamos el puntero inicial
        int ini = 0;
        // Creamos el contador Maximo
        int maxx = 0;

        char caracter;

        // Creamos el slicing windows
        for (int fin = 0; fin < s.length(); fin++) {
            // Registramos en el estado
            estados.put(s.charAt(fin), estados.getOrDefault(s.charAt(fin), 0) + 1);

            // Revisamos si el desplazamiento es valido
            while (estados.get(s.charAt(fin)) > 1) {
                caracter = s.charAt(ini);
                estados.put(caracter, estados.get(caracter)-1);

                if (estados.get(caracter) == 0) estados.remove(caracter);

                ini ++;
            }

            // Calculamos el maximo
            maxx = Math.max(maxx, fin - ini + 1);
        }

        return maxx;

    }
}
