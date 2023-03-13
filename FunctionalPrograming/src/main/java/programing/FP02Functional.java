package programing;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 3, 4, 12, 15);
        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS","PCF", "Azure","Docker","Kubernetes");
        List<Integer> doubleNumbers = doubleList(numbers);
        System.out.println(doubleNumbers);
//        int sum = addListFunctional(numbers);
        int sum = addListFunctionalWithLambda(numbers);
        System.out.println("The total sum of all values is: ".concat(Integer.toString(sum)));
        System.out.println();
        System.out.println("Courses order by length");
        printCoursesOrderByNameLength(courses);
        System.out.println();
        System.out.println("Even number list");
        List<Integer> evenNumbersList = eventNumbersList(numbers);
        System.out.println(evenNumbersList);
        System.out.println();
        System.out.println("Length of all course titles");
        List<Integer> coursesLengths = printListOfCoursesLength(courses);
        System.out.println(coursesLengths);
    }

    private static List<Integer> eventNumbersList(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number%2==0)
                .collect(Collectors.toList());
    }

    private static List<Integer> printListOfCoursesLength(List<String> courses) {
        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .parallel()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }

    private static void printCoursesOrderByNameLength(List<String> courses) {
        courses.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    private static int addListFunctionalWithLambda(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,(aggregate, nextNumber) -> aggregate + nextNumber);
//                .reduce(0,Integer::sum);
    }

    private static int sum(int aggregate, int nextNumber){
        System.out.println(aggregate+ " "+nextNumber);
        return aggregate+nextNumber;
    }

    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,FP02Functional::sum);
    }
}
