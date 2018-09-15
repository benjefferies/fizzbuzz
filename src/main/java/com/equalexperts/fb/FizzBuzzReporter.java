package com.equalexperts.fb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class FizzBuzzReporter {

  static String report(String fizzbuzz) {
    List<String> elements = Arrays.asList(fizzbuzz.split(" "));
    int fizzCount = Collections.frequency(elements, "fizz");
    int buzzCount = Collections.frequency(elements, "buzz");
    int fizzbuzzCount = Collections.frequency(elements, "fizzbuzz");
    int luckyCount = Collections.frequency(elements, "lucky");
    int integerCount = elements.size() - fizzCount - buzzCount - fizzbuzzCount - luckyCount;
    return String.format(
        "%s fizz: %s buzz: %d fizzbuzz: %d lucky: %d integer: %d",
        fizzbuzz, fizzCount, buzzCount, fizzbuzzCount, luckyCount, integerCount);
  }
}
