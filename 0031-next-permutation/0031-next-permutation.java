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
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
            return;
        }
        int end=n-1;
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                end=i;
                index++;
                break;
            }
        }
        reverse(nums,index,n-1);
    }
}