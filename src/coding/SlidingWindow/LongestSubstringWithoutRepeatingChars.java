package coding.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < n; right++){
           while(set.contains(s.charAt(right))){
               set.remove(s.charAt(left));
               left++;
           }
           set.add(s.charAt(right));
           maxLength = Math.max(maxLength, right -left+1);
        }

        return maxLength;
    }
}
