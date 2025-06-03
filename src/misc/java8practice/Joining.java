package misc.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Joining {
    public static void main(String[] args) {

//        merge two unsorted arrays into single sorted array using Java 8

        int[] a = new int[] {4, 2, 8, 11, 7, 1};

        int[] b = new int[] {8, 3, 4,  9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();

        System.out.println(Arrays.toString(c));


//        Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
//        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
//
//        String str = listOfStrings.stream().collect(Collectors.joining(", ","[", "]"));
//
//        System.out.println(str);

    }
}
