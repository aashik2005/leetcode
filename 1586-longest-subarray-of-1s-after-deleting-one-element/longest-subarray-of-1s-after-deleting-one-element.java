class Solution {
    public int longestSubarray(int[] nums) {
        HashMap<Integer,int[]> map=new HashMap<>();
        int sum=0;
        int start=0;
        int end=0;
        int maxi=0;
        int zerocount=0;
        while(end<nums.length){
            if(nums[end]==0){
                zerocount++;
            }
            if(zerocount>1){
                while(nums[start]!=0){
                    start++;
                }
                start++;
                zerocount--;
            }
            maxi=Math.max(end-start,maxi);
            end++;
            
        }
        return maxi;
    }
}