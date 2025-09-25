class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int R=mat.length;
        int C=mat[0].length;
        if(r*c!=R*C){
            return mat;
        }
        int[] arr=new int[R*C];
        int v=0;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                arr[v]=mat[row][col];
                v++;
            }
        }
        int k=0;
        int[][] ans=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans[i][j]=arr[k];
                k++;
            }
        }
        return ans;
    }
}