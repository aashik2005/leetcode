class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int leftsum[]=new int[n];
        int rightsum[]=new int[n];
        leftsum[0]=nums[0];
        rightsum[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            leftsum[i]=nums[i]+leftsum[i-1];
        }
        for(int i=n-2;i>=0;i--){
            rightsum[i]=nums[i]+rightsum[i+1];
        }
        if(n==1 || rightsum[1]==0){
            return 0;
        }
        for(int i=1;i<n-1;i++){
            if(leftsum[i-1]==rightsum[i+1]){
                return i;
            }
        }
        if(leftsum[n-2]==0){
                return n-1;
        }
        return -1;
    }
}