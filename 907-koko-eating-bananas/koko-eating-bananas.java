class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        for(int n:piles){
            maxi=Math.max(n,maxi);
        }
        int mini=1;
        int ans=maxi;
        while(mini<=maxi){
            int mid=(maxi+mini)/2;
            long check=0;
            for(int n:piles){
                check+=(n+mid-1)/mid;
            }
            if(check<=h){
                ans=mid;
                maxi=mid-1;
            }
            else{
                mini=mid+1;
            }
        }
        return ans;
    }
}