package Ejercicios.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/description

public class tresSum {
    public static void main(String[] args) {
        
        List<List<Integer>> a = threeSum(new int[]{-100,-70,-60,110,120,130,160});

        for (List<Integer> conjuto : a) {
            System.out.println(conjuto);
 
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort array to enable two-pointer technique and handle duplicates
        Arrays.sort(nums);
        
        // Fix the first element and use two pointers for the remaining two
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Initialize two pointers for the remaining subarray
            int left = i + 1;
            int right = nums.length - 1;
            
            // Use two-pointer technique to find pairs that sum to -nums[i]
            while (left < right) {
                int total = nums[i] + nums[left] + nums[right];
                
                if (total < 0) {
                    // Sum too small, move left pointer right to increase sum
                    left++;
                } else if (total > 0) {
                    // Sum too large, move right pointer left to decrease sum
                    right--;
                } else {
                    // Found a valid triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip all duplicate values to avoid duplicate triplets
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // Move both pointers to continue searching
                    left++;
                    right--;
                }
            }
        }
        return result;
    }

}
