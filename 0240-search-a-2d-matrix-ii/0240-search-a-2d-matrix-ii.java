class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R=matrix.length;
        int C=matrix[0].length;
        int row=0;
        int col=C-1;
        while(col>=0 && row<R){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]>target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}