package misc.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private int id;
    private String name;
    private int age;

    public Employee(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id="+ id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Author{
    private int age;
    private String firstName;
    private String lastName;

    public Author(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Book{
    private String name;
    private Author author;

    public Book(String name, Author author) {
        this.author = author;
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}

public class Test {
    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee(1234, 21 , "john"),
//                new Employee(1235,23, "sena"),
//                new Employee(1236, 22, "smith"),
//                new Employee(2345,28, "ram"),
//                new Employee(3456,24, "bheem"),
//                new Employee(5678,25, "krishna")
//        );
//
//        List<Employee> sortedEmp = employees.stream()
//                .filter(employee -> String.valueOf(employee.getId()).startsWith("123"))
//                .collect(Collectors.toList());
//
//        System.out.println(sortedEmp);

        List<Book> library = Arrays.asList(new Book("Book1", new Author(30, "FirstName1", "LastName1")),
                new Book("Book2", new Author(50, "FirstName2", "LastName2")),
                new Book("Book3", new Author(60, "FirstName2", "LastName2")),  // ("Book3", 60, "FirstName2", "LastName2"),
                new Book("Book4", new Author(60, "FirstName2", "LastName2")),
                new Book("Book5", new Author(70, "FirstName4", "LastName4")),
                new Book("Book6", new Author(85, "FirstName3", "LastName3")));

        List<String> lastNames =
                library.stream()
                                .map(Book::getAuthor)
                                        .filter(author -> author.getAge() > 50)
                        .limit(2)
                                                .map(Author::getLastName)
                                                        .map(String::toUpperCase)
                        .distinct()
                                                                .collect(Collectors.toList());
        System.out.println(lastNames);
    }
}
