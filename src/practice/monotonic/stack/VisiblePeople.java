package practice.monotonic.stack;

import java.util.Arrays;
import java.util.Stack;

public class VisiblePeople {
    public static void main(String[] args) {
        int[] arr = new int[]{10,6,8,5,11,9};
        System.out.println(Arrays.toString(canSeePersonsCount(arr)));
    }

    public static int[] canSeePersonsCount(int[] heights) {
        int len = heights.length;
        int[] arr = new int[len];

        Arrays.fill(arr, 0);

        Stack<Integer> stack = new Stack<>();

        for(int i = len-1; i>=0; i--){
            int count = 0;
            while(!stack.isEmpty() && heights[i] > heights[stack.peek()]){
                int idx = stack.pop();
                count++;
            }

            if(!stack.isEmpty())
                count++;

            arr[i] = count;

            stack.push(i);

        }


        return arr;
    }
}
