class Solution {
    public int minCut(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        boolean ispal[][]=new boolean[n][n];
        for(int len=1;len<=n;len++){
            for(int i=0;i+len-1<n;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    if(len<=2 || ispal[i+1][j-1]){
                        ispal[i][j]=true;
                    }
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            int mincost=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(ispal[i][j]){
                    int cost=dp[j+1]+1;
                    mincost=Math.min(cost,mincost);
                }
            }
            dp[i]=mincost;
        }
        return dp[0]-1;
    }
}