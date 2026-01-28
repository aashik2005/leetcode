class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int R=obstacleGrid.length;
        int C=obstacleGrid[0].length;
        int dp[][]=new int[R][C];
        if(obstacleGrid[R-1][C-1]==1 || obstacleGrid[0][0]==1){
            return 0;
        }
        dp[0][0]=1;
        for(int r=1;r<R;r++){
            if(obstacleGrid[r][0]!=1){
                dp[r][0]=dp[r-1][0];
            }
        }
        for(int c=1;c<C;c++){
            if(obstacleGrid[0][c]!=1){
                dp[0][c]=dp[0][c-1];
            }
        }
        for(int r=1;r<R;r++){
            for(int c=1;c<C;c++){
                if(obstacleGrid[r][c]!=1){
                    dp[r][c]=dp[r-1][c]+dp[r][c-1];
                }
            }
        }
        return dp[R-1][C-1];
    }
}