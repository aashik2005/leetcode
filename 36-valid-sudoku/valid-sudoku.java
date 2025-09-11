class Solution {
    public boolean isValidSudoku(char[][] board) {
        int R=board.length;
        int C=board[0].length;
        int size=9;
        int rowf[]=new int[R];
        int colf[]=new int[C];
        int subarr[]=new int[size];
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                int subindex=3*(row/3)+(col/3);
                if(board[row][col]!='.'){
                    int digit=board[row][col]-'0';
                    if((rowf[row]&(1<<digit))!=0 || (colf[col]&(1<<digit))!=0 || (subarr[subindex]&(1<<digit))!=0){
                        return false;
                    }
                    rowf[row]|=1<<digit;
                    colf[col]|=1<<digit;
                    subarr[subindex]|=1<<digit;
                }
            }
        }
        return true;
    }
}