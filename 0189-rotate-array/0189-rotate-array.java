class Solution {
    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return;
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k==0 || n==0){
            return;
        }
        k%=n;
        reverse(nums,0,n-1);
        reverse(nums,k,n-1);
        reverse(nums,0,k-1);
        return;
    }
}