package misc.java8practice;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsCoding {
    public static void main(String[] args) {

        // find the frequency
//        List<String> words = Arrays.asList("apple", "apple", "banana", "apple", "coconut", "coconut", "mango","banana");
//        Map<String, Long> wordFreq =
//                words.stream()
//                        .collect(Collectors.groupingBy(word ->word, Collectors.counting()));
//
//        System.out.println(wordFreq);


//        Q. Find the longest string in a list of strings using Java streams:

        List<String> strings = Arrays
                .asList("apple", "banana", "mango", "guva", "pomogranate");

        Optional<String> res = strings.stream()
                .max(Comparator.comparingInt(String::length));

        System.out.println(res.get());

    }
}
