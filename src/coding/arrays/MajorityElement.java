package coding.arrays;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums){
            if (count == 0){
                candidate = num;
            }
            if(candidate == num)
                count++;
            else
                count--;
        }

        return candidate;
    }
}
