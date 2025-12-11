package misc.java8practice;

import java.util.Arrays;
import java.util.List;

public class Searching {

    public static void main(String[] args) {
//        Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max = listOfIntegers.stream().max((a,b)-> a-b).get();
        System.out.println(max);
    }
}
