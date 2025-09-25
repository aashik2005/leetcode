class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
            mat[i][i]=0;
        }
        int k=0;
        for(int i=mat.length-1;i>=0;i--){
            sum+=mat[i][k];
            k++;
        }
        return sum;
    }
}