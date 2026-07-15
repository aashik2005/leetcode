class Solution {
    public int maxSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length; 
        int ans=0;
        for(int r=1;r<R-1;r++){
            for(int c=1;c<C-1;c++){
                int sum=grid[r][c]+grid[r-1][c+1]+grid[r+1][c-1]+grid[r-1][c-1]+grid[r+1][c+1]+grid[r+1][c]+
                grid[r-1][c];
                ans=Math.max(ans,sum);
            }
        }
        return ans;
    }
}