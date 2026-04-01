class Solution {
    int dir[][]=new int[][]{{0,1},{1,0},{-1,0},{0,-1},{1,1},{-1,-1},{-1,1},{1,-1}};
    private int findMine(char[][] board,int r,int c,int R,int C){
        int bmb=0;
        for(int i=0;i<8;i++){
            int adjR=r+dir[i][0];
            int adjC=c+dir[i][1];
            if(adjR<R && adjR>=0 && adjC>=0 && adjC<C){
                if(board[adjR][adjC]=='M'){
                    bmb++;
                }
            }
        }
        return bmb;
    }
    private void dfs(char[][] board,int r,int c,int R,int C){
        int adjM=findMine(board,r,c,R,C);
        if(adjM>0){
            board[r][c]=(char)(adjM+'0');
            return;
        }
        board[r][c]='B';
        for(int i=0;i<8;i++){
            int adjR=r+dir[i][0];
            int adjC=c+dir[i][1];
            if(adjR<R && adjR>=0 && adjC>=0 && adjC<C){
                if(board[adjR][adjC]=='E'){
                    board[adjR][adjC]='B';
                    dfs(board,adjR,adjC,R,C);
                }
            }
        }
        return;
    }
    public char[][] updateBoard(char[][] board, int[] click) {
        int R=board.length;
        int C=board[0].length;
        int r=click[0];
        int c=click[1];
        if(board[r][c]=='M'){
            board[r][c]='X';
            return board;
        }

        dfs(board,r,c,R,C);
        return board;
    }
}