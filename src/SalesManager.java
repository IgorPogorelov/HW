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
        long[] tarr = arr;
        long max = max();
        long min = min();
        int sum = 0;
        for (int i = 0; i < tarr.length; i++) {
            if (tarr[i] == max) {
                tarr[i] = 0;
                break;
            }
        }

        for (int i = 0; i < tarr.length; i++) {
            if (tarr[i] == min) {
                tarr[i] = 0;
                break;
            }
        }

        for (long l : tarr) {
            sum += l;
        }
        return sum/(arr.length - 2);
    }
}