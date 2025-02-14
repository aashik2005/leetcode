class Solution {
    public int islandPerimeter(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        int perimeter=0;
        int diff[][]={{0,1},{0,-1},{1,0},{-1,0}};
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]==1){
                    for(int i=0;i<4;i++){
                        int adjR=row+diff[i][0];
                        int adjC=col+diff[i][1];
                        if(adjR<0 || adjC<0 || adjR>=R || adjC>=C || grid[adjR][adjC]==0){
                            perimeter++;
                        }
                    }
                }
            }
        }
        return perimeter;
    }
}