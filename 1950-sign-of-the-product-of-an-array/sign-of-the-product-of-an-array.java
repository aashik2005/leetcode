class Solution {
    public int arraySign(int[] nums) {
        int minus=0;
        for(int n:nums){
            if(n<0){
                minus++;
            }
            if(n==0){
                return 0;
            }
        }
        if(minus%2!=0){
            return -1;
        }
        else{
            return 1;
        }
    }
}