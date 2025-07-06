class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int R=matrix.length;
        int C=matrix[0].length;
        int left=0,right=C-1;
        int top=0,bottom=R-1;
        int k=0;
        ArrayList<Integer> ans=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                ans.add(matrix[j][right]);
            }
            right--;
            if(bottom>=top){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(right>=left){
                for(int j=bottom;j>=top;j--){
                    ans.add(matrix[j][left]);
                }
                left++;
            }
        }
        return ans;
    }
}