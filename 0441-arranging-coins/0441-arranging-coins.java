class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        int i=1;
        while(n>0){
            if(n-i>=0){
                ans=i;
            }
            n=n-i;
            i++;
        }
        return ans;
    }
}