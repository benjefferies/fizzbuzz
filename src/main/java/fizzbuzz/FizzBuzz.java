package fizzbuzz;

enum FizzBuzz {

    FIZZ("fizz"),
    BUZZ ("buzz"),
    FIZZ_BUZZ("fizzbuzz"),
    LUCKY("lucky");

    private final String key;

    FizzBuzz(final String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }
}
