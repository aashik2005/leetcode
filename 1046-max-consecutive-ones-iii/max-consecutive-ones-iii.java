class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount=0;
        int maxi=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}