class Solution {
    public void sortColors(int[] nums) {
        //Dutch national-flag algorithm
        //assume the half is sorted
        //low is at beginning,midd is at the centre,high is at the end
        //mid is the unsorted and it is sorted based if 1 comes it remians if 0 move to low and if 2 comes move to last
        int low=0,mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                mid++;
                low++;
            }
            else if(nums[mid]==2){
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
            else{
                mid++;
            }
        }
    return;
    }
}