package coding.SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s, int k) {

        int[] ch = new int[26];
        int result = 0;
        int maxCount = 0;

        int left = 0;
        for(int right = 0; right < s.length(); right++){

            maxCount = Math.max(maxCount, ++ch[s.charAt(right) - 'A']);

            while( ((right - left +1) -maxCount) > k){
                ch[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right - left +1);
        }
        return result;
    }

    public static int max(int[] arr){
        int maxNum = arr[0];
        for(int i = 1; i<arr.length; i++)
            maxNum = Math.max(maxNum, arr[i]);

        return maxNum;
    }
}
