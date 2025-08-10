class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0;
        int right=cardPoints.length-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int maxi=sum;
        int p=k-1;
        for(int j=right;j>right-k;j--){
            sum-=cardPoints[p];
            p--;
            sum+=cardPoints[j];
            maxi=Math.max(sum,maxi);
        }
        return maxi;
    }
}