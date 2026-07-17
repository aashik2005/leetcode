class Solution {
    public int numEnclaves(int[][] grid) {
        int total=0;
        int R=grid.length;
        int C=grid[0].length;
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(grid[r][c]==1){
                    total++;
                }
            }
        }
        Queue<int[]> qu=new LinkedList<>();
        int land=0;
        int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(r==0 || r==R-1 || c==C-1 || c==0){
                    if(grid[r][c]==1){
                        land++;
                        grid[r][c]=0;
                        qu.add(new int[]{r,c});
                        while(!qu.isEmpty()){
                            int curr[]=qu.poll();
                            for(int d[]:dir){
                                int adjR=d[0]+curr[0];
                                int adjC=d[1]+curr[1];
                                if(adjR>=0 && adjR<R && adjC>=0 && adjC<C && grid[adjR][adjC]==1){
                                    land++;
                                    grid[adjR][adjC]=0;
                                    qu.add(new int[]{adjR,adjC});
                                }
                            }
                        }  
                    }
                }
            }
        }
        return total-land;
    }
}