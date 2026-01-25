class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        int n=nums.length;
        Arrays.sort(nums);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int val=nums[i+k-1]-nums[i];
            mini=Math.min(mini,val);
        }
        return mini;
    }
}