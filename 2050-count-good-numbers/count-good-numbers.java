class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1_000_000_007;
        long even = (n + 1) / 2;
        long odd = n / 2;
        
        long evenPart = modPow(5, even, mod);
        long oddPart = modPow(4, odd, mod);
        
        return (int)((evenPart * oddPart) % mod);
    }

    long modPow(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp = exp / 2;
        }
        return result;
    }
}