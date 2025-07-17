class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans=new int[2];
        int l=0;
        int r=nums.length-1;
        int index=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                index=mid;
                break;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        if(index==-1){
            return new int[]{-1,-1};
        }
        int i=index;
        while(i>0){
            if(i>0 && nums[i]==nums[i-1]){
                i--;
            }
            else{
                break;
            }
        }
        int j=index;
        while(j<nums.length){
            if(j!=nums.length-1 && nums[j]==nums[j+1]){
                j++;
            }
            else{
                break;
            }
        }
        return new int[]{i,j};
    }
}