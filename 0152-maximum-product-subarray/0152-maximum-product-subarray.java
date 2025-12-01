class Solution {
    public int maxProduct(int[] nums) {
        int pref=1;
        int suff=1;
        int len=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
            if(pref==0)pref=1;
            if(suff==0)suff=1;
            pref*=nums[i];
            suff*=nums[len-1-i];
            ans=Math.max(ans,Math.max(pref,suff));
        }
        return ans;
    }
}