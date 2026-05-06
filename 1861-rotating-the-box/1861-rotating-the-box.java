class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int C=boxGrid.length;
        int R=boxGrid[0].length;
        char[][] box=new char[R][C];

        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                box[r][C-1-c]=boxGrid[c][r];
            }
        }

        for(int c=0;c<C;c++){
            for(int r=R-1;r>=0;r--){
                if(box[r][c]=='*'){
                    continue;
                }
                for(int k=r;k>=0;k--){
                    if(box[k][c]=='*'){
                        break;
                    }
                    if(box[k][c]=='#'){
                        box[k][c]='.';
                        box[r][c]='#';
                        break;
                    }
                }
            }
        }
        return box;
    }
}