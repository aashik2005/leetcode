class Solution {
    public int minOperations(int[] nums) {
        int l=nums.length;
        if(l==1){
            return 0;
        }
        int a=nums[0];
        for(int n:nums){
            if(a!=n){
                return 1;
            }
        }
        return 0;
    }
}