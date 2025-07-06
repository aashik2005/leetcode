class Solution {
    private static void reverse(int[]nums,int st,int end){
        while(st<=end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int size=nums.length;
        int ind=-1;
        for(int i=size-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,size-1);
            return;
        }
        for(int j=size-1;j>=0;j--){
            if(nums[j]>nums[ind]){
                int temp=nums[j];
                nums[j]=nums[ind];
                nums[ind]=temp;
                break;
            }
        }
        reverse(nums,ind+1,size-1);
        return;
    }
}