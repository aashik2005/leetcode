class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int n:nums){
            total+=n;
        }
        if(total<Math.abs(target))return 0;
        if((target+total)%2!=0)return 0;

        int sum=(total+target)/2;
        int dp[]=new int[sum+1];
        dp[0]=1;
        for(int num:nums){
            for(int i=sum;i>=num;i--){
                dp[i]+=dp[i-num];
            }
        }
        return dp[sum];
    }
}