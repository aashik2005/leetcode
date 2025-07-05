class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R=matrix.length;
        int C=matrix[0].length;
        int ind=0;
        for(int row=0;row<R;row++){
            if(target>=matrix[row][0] && target<=matrix[row][C-1]){
                ind=row;
            }
        }
        int low=0;
        int high=C-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(matrix[ind][mid]==target){
                return true;
            }
            else if(matrix[ind][mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}