public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = Integer.MAX_VALUE;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long average(long[] arr) {
        long max = max();
        long min = min();
        int sum = 0;
        for (long sale : sales) {
            if (sale != max | sale != min) {
                sum += sale;
            }

        }
        return sum/arr.length;
    }
}