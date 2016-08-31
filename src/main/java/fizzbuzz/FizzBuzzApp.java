package fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzApp {
    public static void main(String[] args) {
        final FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
        final String fizzBuzzOutput = IntStream.rangeClosed(1, 20)
                .mapToObj(fizzBuzzCalculator::evaluate)
                .collect(Collectors.joining(" "));
        System.out.println(fizzBuzzOutput);
    }
}
