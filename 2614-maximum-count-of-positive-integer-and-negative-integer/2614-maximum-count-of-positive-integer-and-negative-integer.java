class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int n:nums){
            if(n<0){
                neg++;
            }
            else if(n>0){
                pos++;
            }
        }
        return Math.max(pos,neg);
    }
}