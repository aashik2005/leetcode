class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<nums[high]){
                if(nums[low]<ans){
                    ans=nums[low];
                }
                break;
            }
            if(nums[low]<=nums[mid]){
                if(ans>nums[low]){
                    ans=nums[low];
                }
                low=mid+1;
            }
            else if(nums[mid]<=nums[high]){
                if(ans>nums[mid]){
                    ans=nums[mid];
                }
                high=mid-1;
            }
        }
        return ans;
    }
}