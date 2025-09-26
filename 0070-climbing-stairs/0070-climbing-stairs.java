class Solution {
    static int climb(int n,int[] dp){
        if(n<=1){
            return dp[n];
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=climb(n-1,dp)+climb(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n];
        dp[0]=1;
        if(n==1){
            return 1;
        }
        dp[1]=2;
        return climb(n-1,dp);
        //Tabulation:
        // for(int i=2;i<n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n-1];
    }
}