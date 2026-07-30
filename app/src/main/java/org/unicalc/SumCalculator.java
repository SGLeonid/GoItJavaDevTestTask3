package unittesting;

public class SumCalculator {
    public int sum(int n) throws IllegalArgumentException {
        int sum = 0;

        if (n < 1) {
            throw new IllegalArgumentException("n must be greater than zero");
        }

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
