package programing;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 1, 6, 2, 4, 12, 15, 75, 89);
//        printAllNumbersInListStructured(numbers);
        printEvenNumbersInListStructured(numbers);
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        //how to loop the numbers?
        for (int number : numbers) {//structured approach
            if (number % 2 == 0)
                System.out.println(number);
        }
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        //how to loop the numbers?
        for (int number : numbers) {//structured approach
            System.out.println(number);
        }
    }

}
