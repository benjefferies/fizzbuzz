package com.equalexperts.fb;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FizzBuzzReporterTest {

  @Test
  public void produceReportOneToTwenty() {
    // Given
    String fizzbuzz =
        "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";

    // When
    String report = FizzBuzzReporter.report(fizzbuzz);
    // Then
    assertThat(report)
        .isEqualTo(
            "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10");
  }
}
