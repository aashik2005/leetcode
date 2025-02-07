class Solution {
    public boolean isValidSudoku(char[][] board) {
        int R=board.length;
        int C = board[0].length;
        int size=9;
        int [] rowf=new int [R];
        int [] colf=new int[C];
        int [] subarrf=new int[size];
        int Sas=3;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(board[row][col]!='.'){
                    int digit=board[row][col]-'0';
                    int subindex=Sas*(row/Sas)+(col/Sas);
                    if(((rowf[row]&(1<<digit))!=0) || ((colf[col]&(1<<digit))!=0) || ((subarrf[subindex]&(1<<digit))!=0)){
                        return false;
                    }
                    rowf[row] |=(1<<digit);
                    colf[col] |=(1<<digit);
                    subarrf[subindex] |=(1<<digit);
                }
            }
        }
        return true;
    }
}