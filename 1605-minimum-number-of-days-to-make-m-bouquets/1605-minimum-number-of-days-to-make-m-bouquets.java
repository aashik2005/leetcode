class Solution {
    private static int numDays(int[] bloomDay,int k,int mid){
        int bouq=0;
            int need=0;
            for(int n:bloomDay){
                if(n<=mid){
                    need++;
                }
                else{
                    need=0;
                }
                if(need==k){
                    need=0;
                    bouq++;
                }
            }
            return bouq;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int size=bloomDay.length;
        long check=(long)m*(long)k;
        if(check>size){
            return -1;
        }
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        int ans=maxi;
        for(int n: bloomDay){
            maxi=Math.max(maxi,n);
            mini=Math.min(mini,n);
        }
        while(mini<=maxi){
            int mid=(mini+maxi)/2;
            int bouq=numDays(bloomDay,k,mid);
            if(bouq>=m){
                maxi=mid-1;
                ans=mid;
            }
            else{
                mini=mid+1;
            }
        }
        return ans;
    }
}