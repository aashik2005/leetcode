class Solution {
    int dir[][]=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
    boolean[][] visited;
    boolean[][] isBorder;
    private void dfs(int[][] grid,int r,int c,int R,int C,int k){
        visited[r][c]=true;
        for(int d[]:dir){
            int adjR=r+d[0];
            int adjC=c+d[1];
            if(adjR>=R || adjC>=C || adjR<0 || adjC<0 || grid[adjR][adjC]!=k){
                isBorder[r][c]=true;
            }
        }
        for(int d[]:dir){
            int adjR=r+d[0];
            int adjC=c+d[1];
            if(adjR<R && adjR>=0 && adjC>=0 && adjC<C && grid[adjR][adjC]==k  && !visited[adjR][adjC]){
                dfs(grid,adjR,adjC,R,C,k);
            }
        }
        return;
    }
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        
        int co=grid[row][col];
        int R=grid.length;
        int C=grid[0].length;
        visited=new boolean[R][C];
        isBorder=new boolean[R][C];
        dfs(grid,row,col,R,C,co);
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(isBorder[r][c]){
                    grid[r][c]=color;
                }
            }
        }
        return grid;
    }
}