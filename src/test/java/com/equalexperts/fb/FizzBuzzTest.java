package com.equalexperts.fb;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

  @Test
  public void fizzBuzzRangeOneToTwenty() {
    // Given
    final int min = 1;
    final int max = 20;

    // When
    final String output = FizzBuzzCalculator.evaluate(min, max);

    // Then
    assertThat(output)
        .isEqualTo("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz");
  }
}
