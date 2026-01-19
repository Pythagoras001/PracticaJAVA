package Ejercicios.SlidingWindow;

public class MaximumSum {
    
    public static void main(String[] args) {
        System.out.println(maxSum(new int[] {2, 1, 5, 1, 3, 2}, 3));        
    }
    
    
    public static Integer maxSum(int[] nums, Integer k) {
        // Creamos el registros de estado
        int maxSum = 0;
        int ini = 0;

        int sumaArray = 0;

        // Creamos el slicing window
        for (int fin = 0; fin < nums.length; fin++){
            sumaArray += nums[fin];

            // Vemos si la longitud es valida
            while (fin - ini + 1 == k) {
                maxSum = Math.max(maxSum, sumaArray);
                sumaArray -= nums[ini];
                ini ++;
            }
        }
        return maxSum;
    }
}
