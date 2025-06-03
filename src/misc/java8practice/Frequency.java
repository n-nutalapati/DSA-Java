package misc.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {

        // Frequency of each character
        String str =  "a";

        Map<Character, Long> freq = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        System.out.println(freq);


        // frequency of each elememt

        List<String> lst = Arrays.asList("Hi", "Hello", "Notebook", "Pen", "Pencil", "Book");

        Map<String, Long> map = lst.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);
    }
}
