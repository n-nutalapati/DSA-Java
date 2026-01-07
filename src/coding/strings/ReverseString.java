package coding.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcde";

        String reversed = IntStream.range(0,str.length())
                .mapToObj(i -> str.charAt(str.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(reversed);
    }
}
