package fizzbuzz;

import com.google.common.base.Preconditions;
import com.google.common.collect.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Produce a FizzBuzz report in the format:
 * 1 2 lucky 4 buzzfizz
 * fizz: 1
 * buzz: 1
 * fizzbuzz: 0
 * lucky: 1
 * integer: 3
 */
public class FizzBuzzReporter {

    private static final String SPACE = " ";

    private final FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();

    /**
     * Given a range of numbers produce a structured FizzBuzz report.
     * @param lower lower number of the range which is inclusive.
     * @param higher higher number of the range which is inclusive.
     * @return a fizz buzz report.
     */
    public String report(final int lower, final int higher) {
        Preconditions.checkArgument(lower <= higher, "lower value cannot be greater than higher");
        final String singleLineReport = buildFizzBuzzSingleLineReport(lower, higher);
        final String totalsReport = buildTotalsReport(singleLineReport);
        return join(singleLineReport, totalsReport);
    }

    private String buildFizzBuzzSingleLineReport(final int lower, final int higher) {
        return IntStream.rangeClosed(lower, higher)
                .mapToObj(fizzBuzzCalculator::evaluate)
                .collect(Collectors.joining(SPACE));
    }

    private static String buildTotalsReport(final String singleLineReport) {
        final Multimap<String, String> indexedFizzBuzzMultimap = groupFizzBuzzValuesByValue(singleLineReport);
        final String report = Stream.of(FizzBuzz.values())
                .map(fizzBuzz -> fizzBuzz + ": " + indexedFizzBuzzMultimap.removeAll(fizzBuzz.toString()).size())
                .collect(Collectors.joining(System.lineSeparator()));

        final String integerReport = "integer: " + indexedFizzBuzzMultimap.size();
        return join(report, integerReport);
    }

    private static Multimap<String, String> groupFizzBuzzValuesByValue(String singleLineReport) {
        final String[] fizzBuzzValues = singleLineReport.split(SPACE);
        final ImmutableListMultimap<String, String> indexedMultimap = Multimaps.index(Arrays.asList(fizzBuzzValues),
                fizzBuzzValue -> fizzBuzzValue);
        // Create mutable multimap
        return ArrayListMultimap.create(indexedMultimap);
    }

    private static String join(String first, String second) {
        return first + System.lineSeparator() + second;
    }
}
