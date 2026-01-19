package Ejercicios.TwoPointers;
import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{2,0,2,1,1,0})));
    }

    public static int[] sortColors(int[] nums) {
        
        int[] c = new int[]{2, 1};
        int tem;

        for (int j = 0; j < c.length ; j++) {
            int numOrder = 0;
            for (int i = 0; i < nums.length; i++) {
                if (j > 0 && nums[i] == c[j-1]) break;
                if (nums[i] != c[j]){
                    tem = nums[numOrder];
                    nums[numOrder] = nums[i];
                    nums[i] = tem;
                    numOrder ++;
                }
            }
        }
        return nums;
    }

    public static void sortColors2(int[] nums) {
        int left = 0, right = nums.length - 1;
        int i = 0;

        while (i <= right) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
                i++;
            } else if (nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                i++;
            }
        }
    }

}
