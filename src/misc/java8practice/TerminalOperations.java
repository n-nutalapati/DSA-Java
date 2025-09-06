package misc.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {

        // foreach usage example.
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        words.forEach(word -> System.out.println("item is" + word));

        // collect usage
//        List<Integer> nums = Arrays.asList(1,1,2,2,2,3,4,5,5,5,6);
//        Set<Integer> res = nums.stream().collect(Collectors.toSet());
//        System.out.println(res);

        // reduce usage - used to perform a reduction on the elements of a stream
        // compute the product of all numbers in a list
//        List<Integer> nums = Arrays.asList(1,2,3,4,5);
//        Optional<Integer> res = nums.stream()
//                .reduce((a,b) -> a*b);

//        System.out.println(res.get());

        // allMatch - used to check if all elements in the stream satisfy a given predicate. returns true if every element is matches the predicate
        // shot-circuiting

//        List<Integer> nums = Arrays.asList(1,2,3,4,5);
//        boolean res = nums.stream().allMatch(n -> n > 0);
//        System.out.println(res);

        // anyMatch usage
//        List<Integer> nums = Arrays.asList(1,2,3,4,5);
//        boolean res = nums.stream().anyMatch(n -> n > 4);
//        System.out.println(res);

        // noneMatch usage
//        List<Integer> nums = Arrays.asList(1,2,3,4,5);
//        boolean res = nums.stream().noneMatch(n -> n < 0);
//        System.out.println(res);

        // findFirst - used to retrive the first element in a stream - short-circuiting operation.
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        Optional<String> res = words.stream().filter(w -> w.startsWith("c"))
//                .findFirst();
//        System.out.println(res.get());

        // findAny usage
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        Optional<String> res = words.stream().filter(w -> w.startsWith("c"))
//                .findAny();
//        System.out.println(res.get());

        // max, min usage
//        List<Integer> nums = Arrays.asList(9,5,2,7,3);
//        Optional<Integer> res1 = nums.stream().max((a, b) -> a-b);
//        Optional<Integer> res = nums.stream().min((a, b) -> a-b);
//        System.out.println(res);

        // toArray - convert into array
//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        String[] res = words.stream().toArray(String[]::new);

    }
}
