class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int result = 0;

        while (dvd >= dvs) {

            long temp = dvs;
            int count = 1;

            while (dvd >= temp + temp) {
                temp = temp + temp;
                count = count + count;
            }

            dvd = dvd - temp;
            result = result + count;
        }

        return negative ? -result : result;
    }
}
