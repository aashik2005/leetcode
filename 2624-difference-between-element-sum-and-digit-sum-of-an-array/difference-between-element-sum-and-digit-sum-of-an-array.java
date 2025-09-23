class Solution {
    private static int digitsum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int esum=0;
        int dsum=0;
        for(int n:nums){
            esum+=n;
            dsum+=digitsum(n);
        }
        return esum-dsum;
    }
}