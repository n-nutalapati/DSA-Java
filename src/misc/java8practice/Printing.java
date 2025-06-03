package misc.java8practice;

import java.util.Arrays;
import java.util.List;

public class Printing {
    public static void main(String[] args) {
//        given list of integers, print the numbers which are multiples of 5?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfIntegers.forEach(n -> {if(n%5==0) System.out.println(n);});
    }

}
