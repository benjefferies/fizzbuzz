package fizzbuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzApp {

    public static void main(String[] args) {
        System.out.println(new FizzBuzzReporter().report(1, 20));
    }
}
