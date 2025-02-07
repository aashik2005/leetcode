class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int index=0;
        while(index<=max && index<nums.length-1){
            int val=index+nums[index];
            max=Math.max(max,val);
            index++;
        }
        if(max>=nums.length-1)
            return true;
        return false;
    }
}