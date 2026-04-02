class Solution {
    int[][] dir=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    private int dfs(int[][] grid,int r,int c,int R,int C){
        int cnt=1;
        for(int d[]:dir){
            int adjR=r+d[0];
            int adjC=c+d[1];
            if(adjR<R && adjR>=0 && adjC<C && adjC>=0 && grid[adjR][adjC]==1){
                grid[adjR][adjC]=2;
                cnt+=dfs(grid,adjR,adjC,R,C);
            }
        }
        return cnt;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxi=0;
        int R=grid.length;
        int C=grid[0].length;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==1){
                    grid[r][c]=2;
                    maxi=Math.max(maxi,dfs(grid,r,c,R,C));
                }
            }
        }
        return maxi;
    }
}