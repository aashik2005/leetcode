class Solution {
    private static int getsum(int[] arr,int st,int end){
        int sum=0;
        for(int i=st;i<end;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int countPartitions(int[] nums) {
        int cnt=0;
        for(int i=1;i<nums.length;i++){
            int sum1=getsum(nums,i,nums.length);
            int sum2=getsum(nums,0,i);
            if((sum1-sum2)%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}