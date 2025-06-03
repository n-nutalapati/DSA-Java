package misc;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = new int[]{1,0,2,3,0,0,5};
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0 ){
                nums[count++] = nums[i];
            }
        }

        while(count < nums.length){
            nums[count++] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }
}

