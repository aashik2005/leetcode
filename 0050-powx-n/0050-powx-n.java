class Solution {
    public double myPow(double x, int n) {
        long nn = n;

        if (nn < 0) {
            x = 1 / x;
            nn = -nn;
        }

        return power(x, nn);
    }

    private double power(double x, long n) {
        if (n == 0) return 1;

        double half = power(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
