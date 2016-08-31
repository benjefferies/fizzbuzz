package fizzbuzz;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzzCalculator fizzBuzzCalculator;

    @Test
    public void divisibleBy15ShouldFizzBuzz() throws Exception {
        // Given
        final int fizzBuzz = 45;

        // When
        final String output = fizzBuzzCalculator.evaluate(fizzBuzz);

        // Then
        assertThat(output).isEqualTo(FizzBuzzCalculator.FIZZ_BUZZ);
    }

    @Test
    public void divisibleBy3ShouldFizz() throws Exception {
        // Given
        final int fizz = 3;

        // When
        final String output = fizzBuzzCalculator.evaluate(fizz);

        // Then
        assertThat(output).isEqualTo(FizzBuzzCalculator.FIZZ);
    }

    @Test
    public void divisibleBy5ShouldBuzz() throws Exception {
        // Given
        final int buzz = 5;

        // When
        final String output = fizzBuzzCalculator.evaluate(buzz);

        // Then
        assertThat(output).isEqualTo(FizzBuzzCalculator.BUZZ);
    }

    @Test
    public void nonFizzBuzzNumberShouldReturnOriginalNumber() throws Exception {
        // Given
        final int four = 4;

        // When
        final String output = fizzBuzzCalculator.evaluate(four);

        // Then
        assertThat(output).isEqualTo(four);
    }

}
