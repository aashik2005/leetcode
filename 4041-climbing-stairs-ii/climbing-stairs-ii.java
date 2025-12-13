class Solution {
    public int climbStairs(int n, int[] costs) {
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=costs[0]+1;
        if(n==1){
            return dp[1];
        }
        dp[2]=costs[1]+Math.min(4,dp[1]+1);
        for(int i=3;i<=n;i++){
            int cost=costs[i-1];
            int from1=cost+dp[i-1]+1;
            int from2=cost+dp[i-2]+4;
            int from3=cost+dp[i-3]+9;
            dp[i]=Math.min(from1,Math.min(from2,from3));
        }
        return dp[n];
    }
}