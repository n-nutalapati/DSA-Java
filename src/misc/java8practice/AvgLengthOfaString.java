package misc.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AvgLengthOfaString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

//        OptionalDouble avg = words.stream()
//                                    .mapToInt(String::length)
//                .average();

//        System.out.println(avg.getAsDouble());

        words.stream().collect(Collectors.groupingBy(Function.identity())).forEach((a,b)-> {System.out.println(a);
            System.out.println(b);});
    }
}
