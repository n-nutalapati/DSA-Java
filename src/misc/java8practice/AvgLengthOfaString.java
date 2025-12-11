package misc.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
//import java.util.function.Function;
//import java.util.stream.Collectors;

public class AvgLengthOfaString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

//        OptionalDouble avg = words.stream()
//                                    .mapToInt(String::length)
//                .average();

//        System.out.println(avg.getAsDouble());

        OptionalDouble avg = words.stream().map(String::length)
                .mapToInt(x->x)
                .average();

        System.out.println(avg.getAsDouble());
    }
}
