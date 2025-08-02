class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count=0;
        int start=0;
        int end=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=left && nums[i]<=right){
                end=i;
            }
            if(nums[i]>right){
                start=i+1;
                end=i;
            }
            count+=(end-start+1);
        }
        return count;
    }
}