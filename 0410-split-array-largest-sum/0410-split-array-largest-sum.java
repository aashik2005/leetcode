class Solution {
    private int count(int[] nums,int mid){
        int cnt=1;
        int sum=0;
        for(int n:nums){
            if(sum+n>mid){
                cnt++;
                sum=n;
            }
            else{
                sum+=n;
            }
        }
        return cnt;
    }
    public int splitArray(int[] nums, int k) {
        int maxi=Integer.MIN_VALUE;
        int total=0;
        for(int n:nums){
            maxi=Math.max(maxi,n);
            total+=n;
        }
        int ans=total;
        while(maxi<=total){
            int mid=(maxi+total)/2;
            int val=count(nums,mid);
            if(val<=k){
                ans=mid;
                total=mid-1;
            }
            else{
                maxi=mid+1;
            }
        }
        return ans;
    }
}