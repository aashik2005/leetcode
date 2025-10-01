class Solution {
    static double avg(long sum,int k){
        return (double)sum/k;
    }
    public double findMaxAverage(int[] nums, int k) {
        long sum=0;

        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxi=avg(sum,k);
        for(int i=k;i<nums.length;i++){
            sum-=nums[i-k];
            sum+=nums[i];
            maxi=Math.max(maxi,avg(sum,k));
        }
        return maxi;
    }
}