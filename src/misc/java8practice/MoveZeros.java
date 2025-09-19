package misc.java8practice;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 0, 3, 12, 0,0,0,11};

        int left = 0;
        for(int right =0; right <nums.length; right++){
            if(nums[right] != 0) {
                nums[left++] = nums[right];
            }
            nums[right] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
