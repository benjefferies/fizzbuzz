package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzReporterTest {

    private FizzBuzzReporter fizzBuzzReporter;

    @Before
    public void setUp() throws Exception {
        fizzBuzzReporter = new FizzBuzzReporter();
    }

    @Test
    public void shouldReportLucky() throws Exception {
        // Given
        final int lower = 3;
        final int higher = 3;

        //When
        final String report = fizzBuzzReporter.report(lower, higher);

        // Then
        assertThat(report).contains("lucky: 1");
    }

    @Test
    public void shouldReportFizz() throws Exception {
        // Given
        final int lower = 6;
        final int higher = 6;

        //When
        final String report = fizzBuzzReporter.report(lower, higher);

        // Then
        assertThat(report).contains("fizz: 1");
    }

    @Test
    public void shouldReportBuzz() throws Exception {
        // Given
        final int lower = 5;
        final int higher = 5;

        //When
        final String report = fizzBuzzReporter.report(lower, higher);

        // Then
        assertThat(report).contains("buzz: 1");
    }

    @Test
    public void shouldReportFizzBuzz() throws Exception {
        // Given
        final int lower = 15;
        final int higher = 15;

        //When
        final String report = fizzBuzzReporter.report(lower, higher);

        // Then
        assertThat(report).contains("fizzbuzz: 1");

    }

    @Test
    public void shouldReportInteger() throws Exception {
        // Given
        final int lower = 1;
        final int higher = 5;

        //When
        final String report = fizzBuzzReporter.report(lower, higher);

        // Then
        assertThat(report).contains("integer: 3");
    }

    @Test
    public void reportShouldMatchCorrectReportStructure() throws Exception {
        // Given
        final int lower = 1;
        final int higher = 6;

        //When
        final String report = fizzBuzzReporter.report(lower, higher);

        // Then
        assertThat(report).matches(
                "1 2 lucky 4 buzz fizz\n" +
                "lucky: 1\n" +
                "fizz: 1\n" +
                "buzz: 1\n" +
                "fizzbuzz: 0");
    }
}