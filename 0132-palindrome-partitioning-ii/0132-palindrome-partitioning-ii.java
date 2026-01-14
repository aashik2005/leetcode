class Solution {
    private static boolean ispallindrome(String str){
        int i=0;
        int j=str.length()-1;
        if(i==j){
            return true;
        }
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public int minCut(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            int mincost=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(ispallindrome(s.substring(i,j+1))){
                    int cost=dp[j+1]+1;
                    mincost=Math.min(cost,mincost);
                }
            }
            dp[i]=mincost;
        }
        return dp[0]-1;
    }
}