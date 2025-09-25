class Solution {
    static int findmax(int[][] matrix,int col){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            maxi=Math.max(matrix[i][col],maxi);
        }
        return maxi;
    }
    public int[][] modifiedMatrix(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        for(int row=0;row<R;row++){
            for(int col=0;col<C;col++){
                if(matrix[row][col]==-1){
                    matrix[row][col]=findmax(matrix,col);
                }
            }
        }
        return matrix;
    }
}