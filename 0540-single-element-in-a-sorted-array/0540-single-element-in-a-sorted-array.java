class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if((mid==0 || nums[mid]!=nums[mid-1]) && (mid==nums.length-1 || nums[mid]!=nums[mid+1])){
                return nums[mid];
            }
            else if(mid>0 && nums[mid]==nums[mid-1]){
                if((mid-l+1)%2==1){
                    r=mid-2;
                }
                else{
                    l=mid+1;
                }
            }
            else if(mid<nums.length-1 && nums[mid]==nums[mid+1]){
                if((r-mid+1)%2==1){
                    l=mid+2;
                }
                else{
                    r=mid-1;
                }
            }
        }
        return -1;
    }
}