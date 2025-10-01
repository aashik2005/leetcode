class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length-1;
        for(int i=0;i<n;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int i=0,j=0;
        while(j<n+1){
            if(nums[j]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        return nums;
    }
}