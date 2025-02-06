class Solution {
    int diff[][]=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    private boolean dfs(int R, int C,int row, int col, boolean [][]visited,String word, char[][] board,int b){
        if(b==word.length()){
            return true;
        }
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            int adjR=row+diff[i][0];
            int adjC=col+diff[i][1];
        if(adjR>=0 && adjC>=0 && adjR<R && adjC<C){
            if(board[adjR][adjC]==word.charAt(b) && !visited[adjR][adjC]){
                boolean found=dfs(R,C,adjR,adjC,visited,word,board,b+1);
                if(found){
                    return true;
                }
            }
        }
        }
        visited[row][col]=false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int R= board.length;
        int C= board[0].length;
        boolean visited[][]=new boolean[R][C];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]==word.charAt(0)){
                    boolean found=dfs(R,C,row,col,visited,word,board,1);
                    if(found){
                    return true;
                    }
                    }
                }
            }
        return false;
}
}