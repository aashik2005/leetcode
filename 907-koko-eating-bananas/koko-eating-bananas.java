class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxi=Integer.MIN_VALUE;
        int len=piles.length;
        for(int i=0;i<len;i++){
            maxi=Math.max(piles[i],maxi);
        }
        int left=1;
        int ans=maxi;
        while(left<=maxi){
            int banana=(left+maxi)/2;
            long check=0;
            //find
            for(int n:piles){
                check+=(n+banana-1)/banana;
            }
            if(check<=h){
                maxi=banana-1;
                ans=banana;
            }
            else{
                left=banana+1;
            }
        }
        return ans;
    }
}