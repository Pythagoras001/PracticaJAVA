package Ejercicios.TwoPointers;

// https://www.hellointerview.com/learn/code/two-pointers/container-with-most-water

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(max_area(new int[]{3, 4, 1, 2, 2, 4, 1, 3, 2}));
    }

    public static Integer max_area(int[] heights) {

        // Creamos los punteros
        int iz = 0;
        int der = heights.length - 1;
        int distx = heights.length-1;

        int maxx = 0;
        
        // Buscamos el max
        while (iz < der) {
            maxx = Math.max(maxx, Math.min(heights[iz], heights[der]) * distx);

            if (heights[iz] > heights[der]) der--;
            else iz++;

            distx--;
        }
        return maxx;
    }
    
}
