package practice.arrays;

import java.util.Arrays;
import java.util.Set;

public class RearrangeNumbers {
    /*
        Example 1:

            Input: nums = [3,1,-2,-5,2,-4]
            Output: [3,-2,1,-5,2,-4]
            Explanation:
            The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
            The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
            Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.

        Example 2:
            Input: nums = [-1,1]
            Output: [1,-1]
            Explanation:
            1 is the only positive integer and -1 the only negative integer in nums.
            So nums is rearranged to [1,-1]
    * */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{-1, 1})));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];

        int p=0,q=0;

        for(int num: nums){
            if(num>0)
                positive[p++] = num;
            else
                negative[q++] = num;
        }
        p=0;
        q=0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0)
                nums[i] = positive[p++];
            else
                nums[i] = negative[q++];
        }
        return nums;
    }
}
