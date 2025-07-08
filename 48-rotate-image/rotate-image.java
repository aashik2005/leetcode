class Solution {
    private static void reverse(int[] arr,int st,int end){
        while(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public void rotate(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        for(int i=0;i<R-1;i++){
            for(int j=i+1;j<C;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<R;i++){
            reverse(matrix[i],0,C-1);
        }
    }
}