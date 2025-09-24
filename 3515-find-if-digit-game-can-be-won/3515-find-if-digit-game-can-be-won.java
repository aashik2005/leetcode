class Solution {
    public boolean canAliceWin(int[] nums) {
        int single=0;
        int doub=0;
        for(int n:nums){
            if(n<10){
                single+=n;
            }
            else{
                doub+=n;
            }
        }
        return (single!=doub);
    }

}