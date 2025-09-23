class Solution {
    public int findJudge(int n, int[][] trust) {
        int odd[]=new int[n+1];
        int even[]=new int[n+1];
        for(int[] num:trust){
            int a=num[0];
            int b=num[1];
            odd[a]++;
            even[b]++;
        }
        for(int i=1;i<=n;i++){
            if(even[i]>=n-1 && odd[i]==0){
                return i;
            }
        }
        return -1;
    }
}