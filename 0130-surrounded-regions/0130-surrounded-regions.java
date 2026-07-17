class Solution {
    public void solve(char[][] board) {
        Queue<int[]> qu=new LinkedList<>();
        int R=board.length;
        int C=board[0].length;
        int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(r==0 || r==R-1 || c==0 || c==C-1){
                    if(board[r][c]=='O'){
                        board[r][c]='C';
                        qu.add(new int[]{r,c});
                        while(!qu.isEmpty()){
                            int size=qu.size();
                            for(int i=0;i<size;i++){
                                int cur[]=qu.poll();
                                for(int d[]:dir){
                                    int adjR=cur[0]+d[0];
                                    int adjC=cur[1]+d[1];
                                    if(adjR>=0 && adjR<R && adjC>=0 && adjC<C){
                                        if(board[adjR][adjC]=='O'){
                                            board[adjR][adjC]='C';
                                            qu.add(new int[]{adjR,adjC});
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                if(board[r][c]=='O'){
                    board[r][c]='X';
                }
                if(board[r][c]=='C'){
                    board[r][c]='O';
                }
            }
        }
        return;
    }
}