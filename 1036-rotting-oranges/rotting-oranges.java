class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int []> queue=new LinkedList<>();
        int oranges=0;
        int days=-1;
        int R=grid.length,C=grid[0].length;
        boolean visited[][]=new boolean[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(grid[row][col]!=0){
                    if(grid[row][col]==2){
                        queue.add(new int[]{row,col});
                        visited[row][col]=true;
                    }
                oranges++;
                }
            }
        }

        if(oranges==0) return 0;

        int diff[][]=new int[][]{{0,-1},{0,1},{1,0},{-1,0}};
        while(!queue.isEmpty()){
            days++;
            int qsize=queue.size();
            for(int ctr=0;ctr<qsize;ctr++){
                oranges--;
                int orange[]=queue.poll();
                for(int index=0;index<4;index++){
                    int adjR=orange[0]-diff[index][0];
                    int adjC=orange[1]-diff[index][1];
                    if(adjC<C && adjC>=0 && adjR<R && adjR>=0){
                        if(grid[adjR][adjC]==1 && !visited[adjR][adjC]){
                            queue.add(new int[]{adjR,adjC});
                            visited[adjR][adjC]=true;
                        }
                    }
                }
            }
        }
        return oranges==0?days:-1;
    }
}