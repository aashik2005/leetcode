class Solution {
    private static int subArray(int[] nums,int k){
        int left=0;
        int right=0;
        int count=0;
        while(right<nums.length){
            if(nums[right]%2==1){
                k--;
            }
            while(k<0){
                if(nums[left]%2==1){
                    k++;
                }
                left++;
            }
            count+=(right-left)+1;
            right++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return subArray(nums,k)-subArray(nums,k-1);
    }
}