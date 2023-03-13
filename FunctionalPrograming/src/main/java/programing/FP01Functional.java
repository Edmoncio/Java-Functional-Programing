package programing;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 1, 6, 2, 4, 12, 15, 75, 89);
        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS","PCF", "Azure","Docker","Kubernetes");

        System.out.println();
        System.out.println("All number in list");
        printAllNumbersInListFunctional(numbers);
        System.out.println();
        System.out.println("Even numbers in list with method reference");
        printEvenNumbersInListFunctional(numbers);
        System.out.println();
        System.out.println("Even numbers in list with lambda");
        printEvenNumbersInListFunctionalWithLambdas(numbers);
        System.out.println();
        System.out.println("Squares of even numbers with lambdas");
        printSquaresOfEvenNumbersInListFunctionalWithLambdas(numbers);
        System.out.println();
        System.out.println("Odd numbers with lambdas");
        printOddNumberInListFunctionalWithLambdas(numbers);
        System.out.println();
        System.out.println("Cubes of odd numbers");
        printCubesOfOddNumbersFunctional(numbers);


        System.out.println();
        System.out.println("Courses in list");
        printCoursesInListFunctional(courses);
        System.out.println();
        System.out.println("Courses with the word spring");
        printCoursesContainingSpringFunctional(courses);
        System.out.println();
        System.out.println("Courses with at least 4 letters");
        printCoursesHasAtLeast4LettersFunctional(courses);
        System.out.println();
        System.out.println("Number of characters in each course");
        printNumberOfCharactersInEachCourseName(courses);
    }

    private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
        courses.stream()
                .parallel()
                .map(course -> course + " " + course.length())//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printCubesOfOddNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .parallel()
                .filter(number -> number%2 != 0)//Lambda Expression
                .map(number -> number*number*number)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printSquaresOfEvenNumbersInListFunctionalWithLambdas(List<Integer> numbers) {
        numbers.stream()
                .parallel()
                .filter(number -> number%2 == 0)//Lambda Expression
                .map(number -> number*number)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printCoursesHasAtLeast4LettersFunctional(List<String> courses) {
        courses.stream()
                .parallel()
                .filter(course -> course.length() > 3)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printCoursesContainingSpringFunctional(List<String> courses) {
        courses.stream()
                .parallel()
                .filter(course -> course.contains("Spring"))//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printCoursesInListFunctional(List<String> courses) {
        courses.forEach(System.out::println);
    }

    private static void printOddNumberInListFunctionalWithLambdas(List<Integer> numbers) {
        numbers.stream()
                .parallel()
                .filter(number -> number%2 != 0)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printEvenNumbersInListFunctionalWithLambdas(List<Integer> numbers) {
        numbers.stream()
                .parallel()
                .filter(number -> number % 2 == 0)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .parallel()
                .filter(FP01Functional::isEven)//Lambda Expression
                .forEach(System.out::println);//Method Reference
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .parallel()
                .forEach(System.out::println);//Method Reference
    }
}
