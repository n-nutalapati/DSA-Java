package coding.arrays;

import java.util.Arrays;

public class ProductOdArrayExceptSelf {

//    Problem: Product of Array Except Self
//
//    Given an array nums, return an array such that each element at index i is the product of all elements except nums[i].
//
//    Constraints:
//
//    No division
//
//    O(n) time
//
//    Prefer O(1) extra space (output array doesn’t count)
//
//    Example:
//
//    nums = [1,2,3,4]
//    Output = [24,12,8,6]

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        right[nums.length - 1] = 1;

        for(int i=1; i<nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        for(int i= nums.length-2; i>= 0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i=0; i< nums.length; i++){
            nums[i] = left[i] * right[i];
        }

        return nums;

    }

    public int[] productExceptSelfOptimized(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Left products
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Right products
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

}
