class Solution {
    private static boolean solve(char[][] board){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    for(int val=1;val<=9;val++){
                        char num=(char)(val+'0');
                        if(isvalid(board,row,col,num)){
                            board[row][col]=num;
                            if(solve(board)){
                                return true;
                            }
                            else{
                                board[row][col]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isvalid(char[][] board,int row,int col,char val){
        for(int i=0;i<9;i++){
            if(board[row][i]==val){
                return false;
            }
            if(board[i][col]==val){
                return false;
            }
            if(board[(row/3)*3+i/3][(col/3)*3+i%3]==val){
                return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}