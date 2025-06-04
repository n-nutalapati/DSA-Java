package practice.dynamicprogramming;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums){
        int sum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i< nums.length; i++){
            // if sum is -ve, reset to current element
            sum = Math.max(nums[i],sum + nums[i] );
            // update the max sum if greater than current sum
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
