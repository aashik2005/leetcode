class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] pre=new int[n];
        int prefix=1,suffix=1;
        for(int i=0;i<n;i++){
            pre[i]=prefix;
            prefix=prefix*nums[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]=pre[i]*suffix;
            suffix=suffix*nums[i];
        }
        return ans;
    }
}