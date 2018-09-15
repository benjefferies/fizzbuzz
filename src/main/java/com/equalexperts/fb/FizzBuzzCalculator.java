package com.equalexperts.fb;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FizzBuzzCalculator {
  static String evaluate(final int min, final int max) {
    return IntStream.rangeClosed(min, max)
        .mapToObj(FizzBuzzCalculator::evaluate)
        .collect(Collectors.joining(" "));
  }

  private static String evaluate(final int fizzBuzz) {
    final String stringFizzBuzz = String.valueOf(fizzBuzz);

    if (isLucky(stringFizzBuzz)) {
      return "lucky";
    } else if (isFizz(fizzBuzz) && isBuzz(fizzBuzz)) {
      return "fizzbuzz";
    } else if (isFizz(fizzBuzz)) {
      return "fizz";
    } else if (isBuzz(fizzBuzz)) {
      return "buzz";
    } else {
      return stringFizzBuzz;
    }
  }

  private static boolean isLucky(final String fizzBuzz) {
    return fizzBuzz.contains("3");
  }

  private static boolean isFizz(final int fizzBuzz) {
    return isDivisibleBy(fizzBuzz, 3);
  }

  private static boolean isBuzz(final int fizzBuzz) {
    return isDivisibleBy(fizzBuzz, 5);
  }

  private static boolean isDivisibleBy(final int dividend, final int divisor) {
    return dividend % divisor == 0;
  }
}
