package fizzbuzz;

public class FizzBuzzApp {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: Provide lower and high range arguments");
        }
        final int lower = Integer.valueOf(args[0]);
        final int higher = Integer.valueOf(args[1]);
        final FizzBuzzReporter reporter = new FizzBuzzReporter(new FizzBuzzCalculator());
        System.out.println(reporter.generateReportOfFizzBuzzValues(lower, higher));
        System.out.println(reporter.generateReportOfTotals(lower, higher));
    }
}
