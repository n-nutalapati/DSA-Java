package coding.dynamicprogramming;

public class LongestCommonSubsequence {
    public static void main(String[] args) {

        System.out.println(longestCommonSubsequence("abcde", "ace"));
        System.out.println(longestCommonSubstring("abcde", "abc"));

    }
    public static int longestCommonSubsequence(String text1, String text2) {

        // idea is to imagine a 2d array.
        // each time, if characters matches then need to add value equal to 1 + diagonal cell
        // if not matches add value which is max of above cell or side cell
        /*
              | a   c   e
        ===================
            0   0   0   0
        a   0   1   1   1
        b   0   1   1   1
        c   0   1   2   2
        d   0   1   2   2
        e   0   1   2   3

        */


        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];

        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    public static int longestCommonSubstring(String text1, String text2) {

        // idea is to imagine a 2d array.
        // each time, if characters matches then need to add value equal to 1 + diagonal cell
        // if not matches add value which is max of above cell or side cell
        /*
              | a   c   e
        ===================
            0   0   0   0
        a   0   1   1   1
        b   0   1   1   1
        c   0   1   2   2
        d   0   1   2   2
        e   0   1   2   3

        */


        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m+1][n+1];

        int res = 0;

        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                    res = Math.max(res, dp[i][j]);
                }
                else
                    dp[i][j] = 0;
            }
        }
        return res;
    }
}
