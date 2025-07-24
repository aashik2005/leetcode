class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        int currmax=0;
        int currmin=0;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int n:nums){
            total+=n;
            currmax=Math.max(n,currmax+n);
            maxi=Math.max(currmax,maxi);

            currmin=Math.min(n,currmin+n);
            mini=Math.min(currmin,mini);
        }
        if(maxi<0){
            return maxi;
        }
        return Math.max(total-mini,maxi);
    }
}