class Solution {
    public int maxProduct(int[] nums) {
        int product=1;
        int ans=Integer.MIN_VALUE;
        int pref=1;
        int suff=1;
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            pref=pref==0?1:pref;
            suff=suff==0?1:suff;
            pref*=nums[i];
            suff*=nums[n-i];
            ans=Math.max(ans,Math.max(pref,suff));
        }
        return ans;
    }
}