package practice.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintCombination {
    public static void main(String[] args) {
        char[] chars = new char[]{'A', 'B', 'C'};
        System.out.println(combinations(chars));
    }

    private static List<List<Character>> combinations(char[] chars) {
        int n = chars.length;
        List<List<Character>> res = new ArrayList<>();
        
        helper(chars, res, new ArrayList<Character>(), new boolean[n]);
        return res;
    }

    private static void helper(char[] chars, List<List<Character>> res, ArrayList<Character> temp, boolean[] used) {
        if(temp.size() == chars.length){
            res.add(new ArrayList<>(temp));
        } else{
            for(int i = 0; i< chars.length; i++){
                if(used[i]) continue;

                used[i] = true;
                temp.add(chars[i]);
                helper(chars, res, temp, used);

                used[i] = false;
                temp.removeLast();
            }
        }
    }
}
