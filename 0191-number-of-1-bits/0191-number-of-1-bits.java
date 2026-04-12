class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        int ind=0;
        while(ind<32){
            if((1<<ind & n)!=0){
                cnt++;
            }
            ind++;
        }
        return cnt;
    }
}