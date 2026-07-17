class Solution {
    
    public int[][] updateMatrix(int[][] mat) {
        int R=mat.length;
        int C=mat[0].length;
        int res[][]=new int[R][C];
        Queue<int[]> qu=new LinkedList<>();
        boolean visited[][]=new boolean[R][C];
        int dist[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(mat[r][c]==0){
                    qu.add(new int[]{r,c,0});
                    visited[r][c]=true;
                }
            }
        }

        while(!qu.isEmpty()){
            int len=qu.size();
            for(int i=0;i<len;i++){
                int curr[]=qu.poll();
                res[curr[0]][curr[1]]=curr[2];
                for(int d[]:dist){
                    int adjR=curr[0]+d[0];
                    int adjC=curr[1]+d[1];
                    if(adjR<R && adjR>=0 && adjC<C && adjC>=0 && !visited[adjR][adjC]){
                        qu.add(new int[]{adjR,adjC,curr[2]+1});
                        visited[adjR][adjC]=true;
                    }
                }
            }
        }
        return res;
    }
}