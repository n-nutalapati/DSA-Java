package misc.java8practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    // Given a list of list of strings, flatten them into a single list of strings.
    public static void main(String[] args) {
        List<List<String>> lol = Arrays.asList(
                Arrays.asList("one", "two"),
                Arrays.asList("three", "four")
        );

        List<String> result = lol.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(result);
    }
}
