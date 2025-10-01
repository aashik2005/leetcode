class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int alti=0;
        for(int i=0;i<gain.length;i++){
            alti+=gain[i];
            ans=Math.max(ans,alti);
        }
        return ans;
    }
}