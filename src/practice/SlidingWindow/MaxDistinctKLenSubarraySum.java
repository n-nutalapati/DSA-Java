package practice.SlidingWindow;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MaxDistinctKLenSubarraySum {
    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{9,9,9}, 3));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        int left = 0;

        Set<Integer> set = new HashSet<>();

        for(int right = 0; right < nums.length; right++){
            if(!set.contains(nums[right])) {
                sum += nums[right];
                set.add(nums[right]);

                if (right - left + 1 == k) {
                    maxSum = Math.max(sum, maxSum);
                    sum -= nums[left];
                    set.remove(nums[left]);
                    left++;
                }
            } else {
                while(nums[left] != nums[right]){
                    sum = sum - nums[left];
                    set.remove(nums[left]);
                    left++;
                }
                left++;
            }
        }

return maxSum;




    }
}
