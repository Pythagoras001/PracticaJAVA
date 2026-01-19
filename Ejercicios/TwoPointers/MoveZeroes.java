package Ejercicios.TwoPointers;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeroes(new int[]{1,0,4,0,3,0,1})));
    }

    public static int[] moveZeroes(int[] nums) {
        // Creamos los punteros
        int cero = 0;
        int num = 0;

        while (cero < nums.length) {
            if (nums[cero] != 0) cero ++;
            else{
                num = cero + 1;
                while (num < nums.length) {
                    if (nums[num] != 0){
                        nums[cero] = nums[num];
                        nums[num] = 0;
                        break;
                    }
                    num++;
                }
                if (num >= nums.length) break;
            }
        }
        return nums;
    }
}
