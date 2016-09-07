package fizzbuzz;

class FizzBuzzCalculator {

    static final String FIZZ = "fizz";
    static final String BUZZ = "buzz";
    static final String FIZZ_BUZZ = FIZZ + BUZZ;
    static final String LUCKY = "lucky";

    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;
    private static final String LUCKY_NUMBER = "3";

    String evaluate(final int fizzBuzz) {
        final String stringFizzBuzz = String.valueOf(fizzBuzz);

        if (isLucky(stringFizzBuzz)) {
            return LUCKY;
        } else if (isFizz(fizzBuzz) && isBuzz(fizzBuzz)) {
            return FIZZ_BUZZ;
        } else if (isFizz(fizzBuzz)) {
            return FIZZ;
        } else if (isBuzz(fizzBuzz)) {
            return BUZZ;
        } else {
            return stringFizzBuzz;
        }
    }

    private static boolean isFizz(final int fizzBuzz) {
        return isDivisibleBy(fizzBuzz, FIZZ_DIVISOR);
    }

    private static boolean isBuzz(final int fizzBuzz) {
        return isDivisibleBy(fizzBuzz, BUZZ_DIVISOR);
    }

    private static boolean isLucky(final String fizzBuzz) {
        return fizzBuzz.contains(LUCKY_NUMBER);
    }

    private static boolean isDivisibleBy(final int dividend, final int divisor) {
        return dividend % divisor == 0;
    }

}
