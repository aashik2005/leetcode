class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int j=0;
        int minlen=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                sum-=nums[j];
                minlen=Math.min(minlen,i-j+1);
                j++;
            }
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}