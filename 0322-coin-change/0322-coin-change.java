class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int dp[]=new int[amount+1];
        for(int i=1;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
        }
        for(int coin:coins){
            for(int i=coin;i<amount+1;i++){
                int rem=i-coin;
                if(dp[rem]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],dp[rem]+1);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}