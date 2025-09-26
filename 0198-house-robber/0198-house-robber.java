class Solution {
    static int find(int[] nums,int[] dp,int n){
        if(n<=1){
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=Math.max(nums[n]+find(nums,dp,n-2),find(nums,dp,n-1));
        return dp[n];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        return find(nums,dp,n-1);
    }
}