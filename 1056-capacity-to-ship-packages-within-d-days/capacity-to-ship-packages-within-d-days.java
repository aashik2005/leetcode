class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int maxi=0;//total
        int mini=Integer.MIN_VALUE;
        for(int n:weights){
            maxi+=n;
            mini=Math.max(mini,n);
        }
        int ans=maxi;
        int day=0;
        int val=0,i=0;
        while(mini<=maxi){
            int mid=(mini+maxi)/2;
            day=0;val=0; i=0;
            while(i<weights.length){
                val+=weights[i];
                if(val==mid){
                    day++;
                    i++;
                    val=0;
                }
                else if(val<mid){
                    i++;
                    while(i<weights.length && (val+weights[i])<=mid){
                        val+=weights[i];
                        i++;
                    }
                    val=0;
                    day++;
                }
                else{
                    i++;
                }
            }
            if(day<=days){
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