public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int average(int[] arr) {
        int max = max();
        int min = min();
        int sum = 0;
        for (int sale : sales) {
            if (sale != max | sale != min) {
                sum += sale;
            }

        }
        return sum/arr.length;
    }
}