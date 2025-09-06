package practice.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(permute(new int[]{1,2,3}));
//        recurr("", "abc");
    }

    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        backtrack(nums, res, new ArrayList<>(), new boolean[n]);

        return res;
    }

    private static void backtrack(int[] nums, List<List<Integer>> res, List<Integer> tempList, boolean[] used) {
        if(tempList.size() == nums.length){
            res.add(new ArrayList<>(tempList));
        } else {
            for(int i=0; i< nums.length; i++){
                if(used[i]) continue;

                used[i] = true;
                tempList.add(nums[i]);

                backtrack(nums, res, tempList, used);

                used[i] = false;
                tempList.removeLast();

            }
        }
    }

    public static void recurr(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        } else {
            char ch = up.charAt(0);

            for(int i = 0; i<= p.length(); i++){
                String f = p.substring(0, i);
                String s = p.substring(i, p.length());
                recurr(f+ch+s, up.substring(1));
            }
        }
    }


}
