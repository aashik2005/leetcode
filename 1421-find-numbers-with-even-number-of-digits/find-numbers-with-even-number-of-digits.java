class Solution {
    private static int check(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)Math.log10(num)+1;
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