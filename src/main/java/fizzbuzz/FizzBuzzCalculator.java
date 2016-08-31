package fizzbuzz;

/**
 * Calculator to evaluate whether a number is divisible by 3, 5, 15 or the number contains 3.
 * See https://en.wikipedia.org/wiki/Fizz_buzz#Play for FizzBuzz definition and alternative implementations. This
 * implementation has a bit of a spin on it as it also calculates "Lucky numbers".
 */
public class FizzBuzzCalculator {

    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";
    static final String FIZZ_BUZZ = FIZZ + BUZZ;
    static final String LUCKY = "lucky";

    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;
    private static final String LUCKY_NUMBER = "3";

    /**
     * Evaulate {@code fizzbuzz} to establish it's Fizz Buzz value.
     * @param fizzBuzz number to evaluate.
     * @return {@link #FIZZ}, {@link #BUZZ}, {@link #FIZZ_BUZZ} or the original integer.
     */
    public String evaluate(final int fizzBuzz) {
        final String stringFizzBuzz = String.valueOf(fizzBuzz);
        final boolean isLucky = containsThree(stringFizzBuzz);
        final boolean isFizz = isDivisibleBy(fizzBuzz, FIZZ_DIVISOR);
        final boolean isBuzz = isDivisibleBy(fizzBuzz, BUZZ_DIVISOR);

        if (isLucky) {
            return LUCKY;
        } else if (isFizz && isBuzz) {
            return FIZZ_BUZZ;
        } else if (isFizz) {
            return FIZZ;
        } else if (isBuzz) {
            return BUZZ;
        } else {
            return stringFizzBuzz;
        }
    }

    private static boolean containsThree(final String fizzBuzz) {
        return fizzBuzz.contains(LUCKY_NUMBER);
    }

    private static boolean isDivisibleBy(final int dividend, final int divisor) {
        return dividend % divisor == 0;
    }

}
