package fizzbuzz;

import java.util.*;

import static fizzbuzz.FizzBuzzCalculator.*;

class FizzBuzzReporter {

    private static final String REPORT = "" +
            "fizz: %d" + System.lineSeparator() +
            "buzz: %d" + System.lineSeparator() +
            "fizzbuzz: %d" + System.lineSeparator() +
            "lucky: %d" + System.lineSeparator() +
            "integer: %d";
    private static final String INTEGER = "integer";

    private final FizzBuzzCalculator calculator;

    FizzBuzzReporter(final FizzBuzzCalculator calculator) {
        this.calculator = calculator;
    }

    String generateReportOfFizzBuzzValues(final int lower, final int higher) {
        final StringBuilder builder = new StringBuilder();
        for (int c = lower; c <= higher; c++) {
            builder.append(calculator.evaluate(c)).append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

    String generateReportOfTotals(final int lower, final int higher) {
        Map<String, Integer> fizzBuzzCount = calculateTotals(lower, higher);
        return String.format(REPORT, getCount(fizzBuzzCount, FIZZ), getCount(fizzBuzzCount, BUZZ), getCount(fizzBuzzCount, FIZZ_BUZZ),
                getCount(fizzBuzzCount, LUCKY), getCount(fizzBuzzCount, INTEGER));
    }

    private Map<String, Integer> calculateTotals(int lower, int higher) {
        final Map<String, Integer> fizzBuzzCount = new HashMap<>();
        for (int c = lower; c <= higher; c++) {
            final String value = calculator.evaluate(c);
            if (isFizzBuzzType(value)) {
                fizzBuzzCount.putIfAbsent(value, 0);
                Integer integers = fizzBuzzCount.get(value);
                fizzBuzzCount.put(value, ++integers);
            } else {
                fizzBuzzCount.putIfAbsent(INTEGER, 0);
                Integer integers = fizzBuzzCount.get(INTEGER);
                fizzBuzzCount.put(INTEGER, ++integers);
            }
        }
        return fizzBuzzCount;
    }

    private static Integer getCount(Map<String, Integer> fizzBuzzCount, String fizz) {
        final Integer count = fizzBuzzCount.get(fizz);
        return count == null ? 0 : count;
    }

    private static boolean isFizzBuzzType(String value) {
        return FIZZ.equals(value) || BUZZ.equals(value) || FIZZ_BUZZ.equals(value) || LUCKY.equals(value);
    }

}
