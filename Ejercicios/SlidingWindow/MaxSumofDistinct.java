package Ejercicios.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaxSumofDistinct {

    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {5, 5, 5, 5}, 3));
    }

    public static Long maxSum(int[] nums, Integer k) {
        // Creamos los estados
        Long maxSum = (long)0;
        int ini = 0;
        Map<Integer, Integer> estado = new HashMap<>();

        Long sumaArray =  (long)0;
        
        // Creamos el slicingWindow
        for (int fin = 0; fin < nums.length ; fin ++){
            // Registramos estado
            estado.put(nums[fin], estado.getOrDefault(nums[fin], 0) + 1);
            sumaArray += nums[fin];
            // Vemos si es valido
            while (fin - ini + 1 > k || estado.size() > k) {
                sumaArray -= nums[ini];
                estado.put(nums[ini], estado.get(nums[ini]) - 1);
                if (estado.get(nums[ini]) == 0) estado.remove(nums[ini]);
                ini ++;
            }
            maxSum = (fin - ini + 1 == k && estado.size() == k) ? Math.max(maxSum, sumaArray) : maxSum;
        }
        return maxSum;
    }
}
