class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        if(len<2){
            return len;
        }
        int i=2;
        for(int j=2;j<len;j++){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}