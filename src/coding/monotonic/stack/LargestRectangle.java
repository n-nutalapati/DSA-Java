package coding.monotonic.stack;

import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int index = 0;

        while(index < heights.length){
            if(stack.isEmpty() || heights[index] >= heights[stack.peek()]){
                stack.push(index++);
            } else {
                int top = stack.pop();
                int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek()-1);
                maxArea = Math.max(maxArea, area);
            }
        }

        while(!stack.isEmpty()){
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
