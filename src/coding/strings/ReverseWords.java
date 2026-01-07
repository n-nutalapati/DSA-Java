package coding.strings;

import java.util.Arrays;

public class
ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }

    public static String reverseWords(String s){

        String[] str = s.trim().split(" ");
        int left = 0;
        int right = str.length -1;
        while(left < right){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
        return Arrays.toString(str);
    }
}
