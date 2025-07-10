class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] pre=new int[n];
        int prod=1;
        for(int i=0;i<n;i++){
            pre[i]=prod;
            prod=prod*nums[i];
        }
        prod=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=pre[i]*prod;
            prod=prod*nums[i];
        }
        return ans;
    }
}