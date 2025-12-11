class Solution {
    public int maxProfit(int[] prices) {
        int mini=prices[0];
        int n=prices.length;
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            dp[i]=Math.max(dp[i-1],prices[i]-mini);
            if(prices[i]<mini){
                mini=prices[i];
            }
        }
        
        int[] dpdp=new int[n];
        int maxi=prices[n-1];
        for(int i=n-2;i>=0;i--){
            dpdp[i]=Math.max(dpdp[i+1],maxi-prices[i]);
            maxi=Math.max(maxi,prices[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans=Math.max(ans,dp[i]+dpdp[i]);
        }
        return ans;
    }
}