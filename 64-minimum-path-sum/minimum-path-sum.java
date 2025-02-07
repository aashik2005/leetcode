class Solution {
    public int minPathSum(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int [][]matrix=new int[R][C];
        matrix[0][0]=grid[0][0];
        for(int row=1;row<R;row++){
            matrix[row][0]=grid[row][0]+matrix[row-1][0];
        }
        for(int col=1;col<C;col++){
            matrix[0][col]=grid[0][col]+matrix[0][col-1];
        }
        for(int row=1;row<R;row++){
            for(int col=1;col<C;col++){
                matrix[row][col]=Math.min(matrix[row][col-1],matrix[row-1][col])+grid[row][col];
            }
        }
        return matrix[R-1][C-1];
    }
}