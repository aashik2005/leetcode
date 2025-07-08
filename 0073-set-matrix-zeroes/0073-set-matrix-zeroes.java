class Solution {
    public void setZeroes(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int row[]=new int[R];
        int col[]=new int[C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(matrix[i][j]==0){
                    row[i]=-1;
                    col[j]=-1;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(row[i]==-1 || col[j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}