class Solution {
    public int minPathSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        for(int i=1;i<R;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int i=1;i<C;i++){
            grid[0][i]+=grid[0][i-1];
        }

        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                grid[row][col]=Math.min(grid[row][col]+grid[row-1][col],grid[row][col]+grid[row][col-1]);
            }
        }
        return grid[R-1][C-1];
    }
}