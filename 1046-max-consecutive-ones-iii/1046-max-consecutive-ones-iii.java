class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int len=nums.length;
        int maxi=0;
        while(end<len){
            if(nums[end]==0){
                k--;
            }
            while(k<0){
                if(nums[start]==0){
                    k++;
                }
                start++;
            }
            end++;
            maxi=Math.max(maxi,end-start);
        }
        return maxi;
    }
}