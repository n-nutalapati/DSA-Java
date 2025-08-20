package practice.dynamicprogramming;

import java.util.Arrays;

public class AlphanumericDecoder {

    public static int countDecodings(String s) {
        int n = s.length();

        // Base cases
        if (n == 0 || s.charAt(0) == '0') {
            return 0;  // No valid decoding
        }

        int[] dp = new int[n + 1];
        dp[0] = 1; // empty string
        dp[1] = 1; // single character (already checked it's not '0')

        for (int i = 1; i < n; i++) {
            // Single digit check (s.charAt(i-1))
            if (s.charAt(i) != '0') {
                dp[i+1] += dp[i];
            }

            // Two digit check (s.substring(i-2, i))
            int twoDigit = Integer.parseInt(s.substring(i - 1, i+1));
            System.out.println("i="+i+" - "+"twodigit: "+twoDigit);
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i+1] += dp[i - 1];
            }
            System.out.println(Arrays.toString(dp));
        }


        return dp[n];
    }

    // Sample Usage
    public static void main(String[] args) {
        String input1 = "2112";
        String input2 = "2101";
        String input3 = "0";
        String input4 = "1123";

        System.out.println(countDecodings(input1)); // Output: 5
        System.out.println(countDecodings(input2)); // Output: 1
        System.out.println(countDecodings(input3)); // Output: 0
        System.out.println(countDecodings(input4)); //
    }
}