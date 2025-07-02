class Solution {
    public int swimInWater(int[][] grid) {
        int R=grid.length;
        int C=grid[0].length;
        boolean visited[][]=new boolean[R][C];
        PriorityQueue<int[]>heap=new PriorityQueue<>((a,b)->Integer.compare(a[2],b[2]));
        int diff[][]={{1,0},{0,1},{-1,0},{0,-1}};
        heap.add(new int[]{0,0,grid[0][0]});
        int ans=Integer.MIN_VALUE;
        while(!heap.isEmpty()){
            int check[]=heap.poll();
            int row=check[0];
            int col=check[1];
            visited[row][col]=true;
            ans=Math.max(ans,check[2]);
            if(col==C-1 && row==R-1){
                break;
            }
            for(int i=0;i<4;i++){
                int adjrow=row+diff[i][0];
                int adjcol=col+diff[i][1];
                if(adjrow>=0 && adjcol>=0 && adjrow<R && adjcol<C && visited[adjrow][adjcol]==false){
                    heap.add(new int[]{adjrow,adjcol,grid[adjrow][adjcol]});
                }
            }
        }
        return ans;
    }
}