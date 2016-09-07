package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzReporterTest {

    private FizzBuzzReporter fizzBuzzReporter;

    @Before
    public void setUp() throws Exception {
        fizzBuzzReporter = new FizzBuzzReporter(new FizzBuzzCalculator());
    }

    @Test
    public void shouldReportLucky() throws Exception {
        // Given
        final int lower = 3;
        final int higher = 3;

        //When
        final String report = fizzBuzzReporter.generateReportOfTotals(lower, higher);

        // Then
        assertThat(report).contains("lucky: 1");
    }

    @Test
    public void shouldReportFizz() throws Exception {
        // Given
        final int lower = 6;
        final int higher = 6;

        //When
        final String report = fizzBuzzReporter.generateReportOfTotals(lower, higher);

        // Then
        assertThat(report).contains("fizz: 1");
    }

    @Test
    public void shouldReportBuzz() throws Exception {
        // Given
        final int lower = 5;
        final int higher = 5;

        //When
        final String report = fizzBuzzReporter.generateReportOfTotals(lower, higher);

        // Then
        assertThat(report).contains("buzz: 1");
    }

    @Test
    public void shouldReportFizzBuzz() throws Exception {
        // Given
        final int lower = 15;
        final int higher = 15;

        //When
        final String report = fizzBuzzReporter.generateReportOfTotals(lower, higher);

        // Then
        assertThat(report).contains("fizzbuzz: 1");

    }

    @Test
    public void shouldReportInteger() throws Exception {
        // Given
        final int lower = 1;
        final int higher = 5;

        //When
        final String report = fizzBuzzReporter.generateReportOfTotals(lower, higher);

        // Then
        assertThat(report).contains("integer: 3");
    }

    @Test
    public void reportShouldMatchCorrectReportStructure() throws Exception {
        // Given
        final int lower = 1;
        final int higher = 6;

        //When
        final String report = fizzBuzzReporter.generateReportOfTotals(lower, higher);

        // Then
        assertThat(report).isEqualTo(
                "fizz: 1" + System.lineSeparator() +
                "buzz: 1" + System.lineSeparator() +
                "fizzbuzz: 0" + System.lineSeparator() +
                "lucky: 1" + System.lineSeparator() +
                "integer: 3");
    }

    @Test
    public void shouldEvaluateRangeOfFizzBuzzValuesForReport() throws Exception {
        // Given
        final int lower = 1;
        final int higher = 6;

        final String report = fizzBuzzReporter.generateReportOfFizzBuzzValues(lower, higher);

        assertThat(report).isEqualTo("1 2 lucky 4 buzz fizz");
    }
}