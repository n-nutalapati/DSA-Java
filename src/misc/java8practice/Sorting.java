package misc.java8practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {

//        Given a list of strings, sort them according to increasing order of their length

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        listOfStrings.stream().sorted((a,b)->a.length() - b.length()).forEach(System.out::println);

//


        // sort the given list of decimals in reverse order
//        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//
//        decimalList.stream().sorted(Comparator.reverseOrder());

    }
}
