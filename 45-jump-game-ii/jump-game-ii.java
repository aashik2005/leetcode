class Solution {
    public int jump(int[] nums) {
        int N=nums.length;
        int dp[]=new int[N];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<N-1;i++){
            int step=nums[i];
            for(int j=i+1;j<=i+step;j++){
                if(j<N){
                    dp[j]=Math.min(dp[i]+1,dp[j]);
                }
            }
        }
        return dp[N-1];
    }
}