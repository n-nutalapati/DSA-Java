package practice.SlidingWindow;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidboaoo"));
    }

    public static boolean checkInclusion(String s1, String s2) {

        int right = s1.length();

        for(int left = 0; left + right <= s2.length(); left++){
            if(checkAnagram(s1, s2.substring(left,left+right)))
                return true;
        }

        return false;
    }

    static boolean checkAnagram(String s1, String s2){
        int[] ch = new int[26];
        for(int i=0; i<s1.length(); i++){
            ch[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            ch[s2.charAt(i) - 'a']--;
        }
        for(int i : ch){
            if(i!=0)
                return false;
        }
        return true;
    }

}
