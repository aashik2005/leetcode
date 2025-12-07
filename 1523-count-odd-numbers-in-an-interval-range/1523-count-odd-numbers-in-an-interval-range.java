class Solution {
    public int countOdds(int low, int high) {
        int cnt=0;
        int val=high-low;
        if(low%2==0 && high%2==0){
            return val/2;
        }
        else if(low%2==1 && high%2==1){
            return (val/2)+1;
        }
        else{
            return (val/2)+1;
        }
        // return val/2;
    }
}