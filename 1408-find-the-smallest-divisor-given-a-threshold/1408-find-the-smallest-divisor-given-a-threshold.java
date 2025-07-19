class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int num:nums){
            high=Math.max(high,num);
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int sum=0;
            for(int num:nums){
                sum+=(num+mid-1)/mid;
            }
            if(sum<=threshold){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(low);
        return ans;
    }
}