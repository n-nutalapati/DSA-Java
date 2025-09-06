package misc.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorOperations {
    public static void main(String[] args) {

        // joining - used to concat the elements of stream into single string.

//        List<String> words = Arrays.asList("apple", "banana", "cherry");
//        String word = words.stream()
//                .collect(Collectors.joining(", ","[", "]"));
//        System.out.println(word);

        // groupingBy - group elements of stream by a specified classifier function
        // Qno. Group a list of people by their city
//        List<Person> people = Arrays.asList(
//                new Person("john", "New York"),
//                new Person("wick", "London"),
//                new Person("smith", "New York")
//        );
//
//        Map<String, List<Person>> res = people.stream()
//                .collect(Collectors.groupingBy(Person::getCity));
//
//        System.out.println(res);

    }
}

class Person {
    private String name;
    private String city;

    Person (String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}