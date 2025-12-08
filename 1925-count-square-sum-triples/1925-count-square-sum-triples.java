class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(i!=j){
                    long sq=(i*i)+(j*j);
                    int root=(int)Math.sqrt(sq);
                    if(root<=n && root*root==sq)
                    {
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}