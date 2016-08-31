package fizzbuzz;

/**
 * Calculator to evaluate whether a value a number is divisible by 3, 5 or 15.
 * See https://en.wikipedia.org/wiki/Fizz_buzz#Play for definition and alternative implementations.
 */
public class FizzBuzzCalculator {

    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";
    static final String FIZZ_BUZZ = FIZZ + BUZZ;

    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;

    /**
     * Evaulate {@code fizzbuzz} to establish it's Fizz Buzz value.
     * @param fizzBuzz number to evaluate.
     * @return {@link #FIZZ}, {@link #BUZZ}, {@link #FIZZ_BUZZ} or the original integer.
     */
    public String evaluate(final int fizzBuzz) {
        final boolean isFizz = isDivisibleBy(fizzBuzz, FIZZ_DIVISOR);
        final boolean isBuzz = isDivisibleBy(fizzBuzz, BUZZ_DIVISOR);

        if (isFizz && isBuzz) {
            return FIZZ_BUZZ;
        } else if (isFizz) {
            return FIZZ;
        } else if (isBuzz) {
            return BUZZ;
        } else {
            return String.valueOf(fizzBuzz);
        }
    }


    private static boolean isDivisibleBy(final int dividend, final int divisor) {
        return dividend % divisor == 0;
    }

}
