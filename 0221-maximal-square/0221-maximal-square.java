class Solution {
    public int maximalSquare(char[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int dp[][]=new int[R][C];
        int res=0;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(matrix[r][c]=='1'){
                    if(r==0 || c==0){
                        dp[r][c]=1;
                    }
                    else{
                        dp[r][c]=Math.min(dp[r-1][c-1],Math.min(dp[r-1][c],dp[r][c-1]))+1;
                    }
                }
                res=Math.max(dp[r][c],res);
            }
        }
        return res*res;
    }
}