package practice.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sol = new ArrayList<>();

        backtrack(nums, 0, sol, res);

        return res;

    }

    public static void backtrack(int[] nums, int start, List<Integer> sol, List<List<Integer>> res){
        res.add(new ArrayList<>(sol));

        for(int i = start; i< nums.length; i++){

            sol.add(nums[i]);
            backtrack(nums, i+1, sol, res);
            sol.removeLast();

        }
    }

//    public static void recur(int )
}
