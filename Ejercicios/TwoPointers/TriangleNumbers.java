package Ejercicios.TwoPointers;

import java.util.Arrays;

public class TriangleNumbers {
    
    public static void main(String[] args) {
        System.out.println(triangleNumber(new int[]{11,4,9,6,15,18}));
    }

    public static Integer triangleNumber(int[] heights) {
        // Ordenamos la lista
        Arrays.sort(heights);
        // Creamos los punteros
        int uno;
        int dos;
        int suma;
        int contador = 0;
    
        for (int tres = heights.length-1; tres > 1; tres--) {
            uno = 0;
            dos = tres-1;

            // Hacemos el two pointers
            while (uno < dos) {
                suma = heights[uno] + heights[dos];

                if (suma > heights[tres]){
                    contador += dos - uno;
                    dos --;
                }
                else if (suma <= heights[tres]) uno ++;
            }
        }

        return contador;
    }
}
