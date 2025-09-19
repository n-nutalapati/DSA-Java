package misc.java8practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewQuestions {
    public static void main(String[] args) {
//        01 Given a sentence, find the word that has the highest length
//        String s = "I am going to get the offer letter";
//        String res = Arrays.stream(s.split(" "))
//                .max(Comparator.comparing(String::length)).get();


//        02 Remove duplicates from the string and return in the same order
//        String str = "abbbcccccdddddeeff";
//        String res = Arrays.stream(str.split(""))
//                .distinct()
//                .collect(Collectors.joining());


//        03 Find the word that has the second highest length
//        String s = "I love my job and also loveee to shift";
//        String res = Arrays.stream(s.split(" "))
//                .sorted((a,b)->b.length()-a.length())
//                .skip(1)
//                .findFirst().get();


//        04 Find the 2nd highest length word in the given sentence
//        String s = "I love my job and also loveee to shift";
//        int res = Arrays.stream(s.split(" "))
//                .sorted((a,b)->b.length()-a.length())
//                .skip(1)
//                .findFirst().get().length();

//        05 Given a sentence, find the occurrence of each word
//        String s = "hi hi my my my name name name name is nu nu nu nu nu hi";
//        Map<String, Long> res = Arrays.stream(s.split(" "))
//                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

//        06 Given a sentence, find the words with a specified number of vowels
//        String s = "I am learning streams API in java";
//        Arrays.stream(s.split(" "))
//                        .filter(s1 -> s1.replaceAll("[^aeiouAEIOU]","").length()==2)
//                                .forEach(System.out::println);


//        07 Divide given integer list into lists of even and odd numbers
//        int[] arr = {1,2,3,4,5,6,7,8};
//
//        List<Integer> lst = Arrays.stream(arr).boxed()
//                .toList();
//
//        List<List<Integer>> res = lst.stream()
//                .collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()))
//                        .entrySet().stream()
//                        .map(Map.Entry::getValue)
//                                .collect(Collectors.toList());

//        List<List<Integer>> res = new ArrayList<>(lst.stream()
//                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()))
//                .values());

//        08 Given a word, find the occurrence of each character
//        String s = "Mississippi";
//        Map<String, Long> res = Arrays.stream(s.split(""))
//                        .collect(Collectors.groupingBy(Function.identity(),Collectors.counting() ));


//        09 Arrange the numbers in Descending/Ascending Order
//        int[] arr = new int[]{1,3,2,5,4};
//        Arrays.stream(arr)
//                        .boxed()
//                                .sorted((a,b)->b-a)
//                                        .forEach(System.out::print);

//        10 Given an array, find the sum of unique elements
//        int[] arr = {1,6,7,8,1,1,8,8,7};
//        Integer res = Arrays.stream(arr).distinct().sum();

//        11 Given a string, find the first non-repeated character
        String s = "Hello World";

        String res = Arrays.stream(s.split(""))
                        .filter(c->s.indexOf(c)==s.lastIndexOf(c))
                                .findFirst()
                                        .get();
        System.out.println(res);
    }
}
