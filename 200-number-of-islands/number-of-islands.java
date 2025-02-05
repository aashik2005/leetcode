class Solution {
    int[][]diff=new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
    private void dfs(char[][] grid,int R,int C,int row,int col){
        grid[row][col]='0';
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
            if(adjC>=0 && adjR>=0 && adjC<C && adjR<R){
                if(grid[adjR][adjC]=='1'){
                    dfs(grid,R,C,adjR,adjC);
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int R=grid.length,C=grid[0].length;
        int island=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]=='1'){
                    island++;
                    dfs(grid,R,C,row,col);
                }
            }
        }
        return island;
    }
}