class Solution {
    public boolean judgeCircle(String moves) {
        int row=0;
        int col=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U'){
                row-=1;
            }
            else if(ch=='D'){
                row+=1;
            }
            else if(ch=='L'){
                col-=1;
            }
            else if(ch=='R'){
                col+=1;
            }
        }
        return (row==0 && col==0);
    }
}