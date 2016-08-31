package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private FizzBuzzCalculator fizzBuzzCalculator;

    @Before
    public void setUp() throws Exception {
        this.fizzBuzzCalculator = new FizzBuzzCalculator();
    }

    @Test
    public void divisibleBy15ShouldBeFizzBuzz() throws Exception {
        // Given
        final int fizzBuzz = 45;

        // When
        final String output = fizzBuzzCalculator.evaluate(fizzBuzz);

        // Then
        assertThat(output).isEqualTo(FizzBuzzCalculator.FIZZ_BUZZ);
    }

    @Test
    public void divisibleBy3ShouldBeFizz() throws Exception {
        // Given
        final int fizz = 6;

        // When
        final String output = fizzBuzzCalculator.evaluate(fizz);

        // Then
        assertThat(output).isEqualTo(FizzBuzzCalculator.FIZZ);
    }

    @Test
    public void divisibleBy5ShouldBeBuzz() throws Exception {
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
        assertThat(output).isEqualTo(String.valueOf(four));
    }

    @Test
    public void numbersContaining3ShouldBeLucky() throws Exception {
        // Given
        final int lucky = 43;

        // When
        final String output = fizzBuzzCalculator.evaluate(lucky);

        // Then
        assertThat(output).isEqualTo(FizzBuzzCalculator.LUCKY);

    }
}
