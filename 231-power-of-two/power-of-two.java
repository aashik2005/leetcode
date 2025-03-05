class Solution {
    public boolean isPowerOfTwo(long n) {
        if (n==0)
        return false;
        else 
        return (n&(n-1))==0;
    }
}