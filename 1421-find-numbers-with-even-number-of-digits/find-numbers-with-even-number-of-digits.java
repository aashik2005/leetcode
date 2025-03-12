class Solution {
    private static int check(int num){
        int ck=0;
        while(num>0){
            ck++;
            num/=10;
        }
        return ck;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            int ab=check(n);
            if(ab%2==0){
                count++;
            }
        }
        return count;
    }
}