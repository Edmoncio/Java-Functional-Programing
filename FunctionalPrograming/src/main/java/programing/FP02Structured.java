package programing;

import java.util.Comparator;
import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 1, 6, 2, 4, 12, 15, 75, 89);
        int sum = addListStructured(numbers);
        System.out.println("The total sum of all values is: ".concat(Integer.toString(sum)));

    }

    private static int addListStructured(List<Integer> numbers) {
        int sum = 0;
        for (int number: numbers){
         sum += number;
        }
        return sum;
    }
}
