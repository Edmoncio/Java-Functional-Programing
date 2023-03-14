package programing;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP03FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> integerPredicate = number -> number % 2 == 0;
        Predicate<Integer> integerPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Function<Integer, Integer> integerIntegerFunction = number -> number * number;
        Consumer<Integer> println = System.out::println;

        numbers.stream()
                 .filter(integerPredicate)
                 .map(integerIntegerFunction)
                 .forEach(println);
    }
}
