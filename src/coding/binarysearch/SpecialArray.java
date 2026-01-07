package coding.binarysearch;

public class SpecialArray {
    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{0,4,3,0,4}));
    }

    public static int specialArray(int[] nums) {
        int len = nums.length;
        int x = 1;
        while(x <= len){
            int count = 0;
            for(int num : nums) {
                if(x <= num) count++;
            }

            if(x == count)
                return x;

            else
                x++;
        }
        return -1;
    }
}
