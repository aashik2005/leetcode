class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int odd=0;
        int even=1;
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[even]=nums[i];
                even=even+2;
            }
            else{
                arr[odd]=nums[i];
                odd=odd+2;
            }
        }
        return arr;
    }
}