package coding.prefixsum;

import java.util.HashMap;
import java.util.Map;

public class SubarrayEqualsK {

//    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//    A subarray is a contiguous non-empty sequence of elements within an array.
//
//            Example 1:
//
//    Input: nums = [1,1,1], k = 2
//    Output: 2
//    Example 2:
//
//    Input: nums = [1,2,3], k = 3
//    Output: 2

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] {1,2,3}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        // base case
        map.put(0,1);

        for(int num : nums){
            prefixSum += num;

            if(map.containsKey(prefixSum - k)){
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }

        return count;
    }
}
