class Solution {
    public int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        // while(start<end){
        //     int mid=start+((end-start)/2);
        //     if(nums[mid]>nums[mid+1]){
        //         end=mid;
        //     }
        //     else{
        //         start=mid+1;
        //     }
        // }
        // return start;
        if(nums.length==1){
            return 0;
        }
        if(nums[start]>nums[start+1]){
            return 0;
        }
        if(nums[end]>nums[end-1]){
            return end;
        }
        while(start<=end){
            int mid=(start+end)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==nums.length-1 || nums[mid]>nums[mid+1])){
                return mid;
            }
            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
    }
}