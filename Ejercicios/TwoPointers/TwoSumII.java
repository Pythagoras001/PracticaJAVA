package Ejercicios.TwoPointers;

import java.util.Arrays;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description

public class TwoSumII {
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int suma = 0;
        
        for (int iz = 0, der = numbers.length - 1; iz < der;) {
            suma = numbers[iz] + numbers[der];
            if (suma == target) return new int[]{iz+1, der+1};
            else if (suma > target) der--;
            else iz++;   
        }

        return new int[]{};
    }

}
