class Solution {
    private static void solve(char[][] board,int row,int n,List<List<String>> result,
    boolean[] rowf,boolean[] colf,boolean[] diagonalup,boolean[] diagonaldown){
        if(row==n){
            result.add(construct(board,n));
            return;
        }
        for(int col=0;col<n;col++){
            if(!rowf[row] && !colf[col] && !diagonalup[row+col] && !diagonaldown[n-1+col-row]){
                rowf[row]=true;
                colf[col]=true;
                diagonalup[row+col]=true;
                diagonaldown[col-row+n-1]=true;
                board[row][col]='Q';
                solve(board,row+1,n,result,rowf,colf,diagonalup,diagonaldown);
                rowf[row]=false;
                colf[col]=false;
                diagonalup[row+col]=false;
                diagonaldown[col-row+n-1]=false;
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        boolean rowf[]=new boolean[n];
        boolean colf[]=new boolean[n];
        boolean diagonalup[]=new boolean[(2*n)-1];
        boolean diagonaldown[]=new boolean[(2*n)-1];
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                board[row][col]='.';
            }
        }
        List<List<String>> result=new ArrayList<>();
        solve(board,0,n,result,rowf,colf,diagonalup,diagonaldown);
        return result;
    }
    private static List<String> construct(char[][]  board,int n){
        List<String> ans=new ArrayList<>();
        for(int row=0;row<n;row++){
            String str="";
            for(int col=0;col<n;col++){
                if(board[row][col]=='Q'){
                    str+="Q";
                }
                else{
                    str+=".";
                }
            }
            ans.add(str);
        }
        return ans;
    }
}