package coding.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsInString {
    public static void main(String[] args) {

        String s = "abab";
        String p = "ab";

        System.out.println(findAnagrams(s,p));


    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> idx = new ArrayList<>();
        char[] ch = p.toCharArray();
        Arrays.sort(ch);
        String sortedP = String.valueOf(ch);
        int right = p.length();

        for(int left = 0; left + right <= s.length(); left++){
            String str = s.substring(left, left + right);
            char[] strCh = str.toCharArray();
            Arrays.sort(strCh);
            String sortedStr = String.valueOf(strCh);
            if(sortedP.equals(sortedStr)){
                idx.add(left);
            }
        }

        return idx;
    }


}
