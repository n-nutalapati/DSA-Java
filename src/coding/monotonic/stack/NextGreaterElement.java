package coding.monotonic.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
//    leetcode 496
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
    }

    public static int[] nextGreaterElement1(int[] nums1, int[] nums2) {

        int[] arr = new int[nums2.length];
        Arrays.fill(arr, -1);

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < nums2.length; i++){

            while(!stack.isEmpty() && nums2[i] > nums2[stack.peek()]){
                arr[stack.pop()] = nums2[i];
            }

            stack.push(i);
        }

        System.out.println("arr: "+Arrays.toString(arr));

        int[] res = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    res[i] = arr[j];
                }
            }
        }


        return res;

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map= new HashMap<>();
        Stack<Integer> stack= new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int curr=nums2[i];
            while(!stack.isEmpty() && stack.peek()<=curr){
                stack.pop();
            }

            if(stack.isEmpty()){
                map.put(curr,-1);
            }
            else{
                map.put(curr,stack.peek());
            }
            stack.push(curr);
        }

        int[] ans= new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }

}
