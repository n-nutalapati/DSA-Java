package misc;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public static void main(String[] args) {

//        Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

        System.out.println(findMaxLength(new int[]{0,1,1,1,1,1,0,0,0}));
    }

    public static  int findMaxLength(int[] nums){

        int maxLen = 0;
        int freq = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++){

            if(nums[i] == 0) freq--;
            else freq++;

            if(map.containsKey(freq)){
                maxLen = Math.max(maxLen, i-map.get(freq));
                System.out.println(maxLen + " : " + i + " : " + map.get(freq) );
            } else {
                map.put(freq, i);
                System.out.println("putting: "+map);
            }
        }

        return maxLen;
    }
}
