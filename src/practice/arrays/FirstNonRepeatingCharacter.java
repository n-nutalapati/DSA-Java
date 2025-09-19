package practice.arrays;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "character";

        int[] ch = new int[26];

        for(int i=0; i< s.length(); i++ ){
            ch[s.charAt(i)-'a']++;
        }

        for(int i =0; i< s.length(); i++){
            if(ch[s.charAt(i)-'a'] == 1) {System.out.println(s.charAt(i)); return;}
        }
        System.out.println("no character");
    }
}
