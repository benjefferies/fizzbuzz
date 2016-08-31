package fizzbuzz;

/**
 * Calculator to evaluate whether a number is divisible by 3, 5, 15 or the number contains 3.
 * See https://en.wikipedia.org/wiki/Fizz_buzz#Play for FizzBuzz definition and alternative implementations. This
 * implementation has a bit of a spin on it as it also calculates "Lucky numbers".
 */
public class FizzBuzzCalculator {

    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;
    private static final String LUCKY_NUMBER = "3";

    /**
     * Evaulate {@code fizzbuzz} to establish it's FizzBuzz value.
     * @param fizzBuzz number to evaluate.
     * @return String values of {@link FizzBuzz#FIZZ}, {@link FizzBuzz#BUZZ}, {@link FizzBuzz#FIZZ_BUZZ} or the original
     * integer.
     */
    public String evaluate(final int fizzBuzz) {
        final String stringFizzBuzz = String.valueOf(fizzBuzz);
        final boolean isLucky = containsThree(stringFizzBuzz);
        final boolean isFizz = isDivisibleBy(fizzBuzz, FIZZ_DIVISOR);
        final boolean isBuzz = isDivisibleBy(fizzBuzz, BUZZ_DIVISOR);

        if (isLucky) {
            return FizzBuzz.LUCKY.toString();
        } else if (isFizz && isBuzz) {
            return FizzBuzz.FIZZ_BUZZ.toString();
        } else if (isFizz) {
            return FizzBuzz.FIZZ.toString();
        } else if (isBuzz) {
            return FizzBuzz.BUZZ.toString();
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
