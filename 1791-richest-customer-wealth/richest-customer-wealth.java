class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=Integer.MIN_VALUE;
        int balance=0;
        for(int[]persons:accounts){
            balance=0;
            for(int money:persons){
                balance+=money;
            }
            if(balance>max){
                max=balance;
            }
        }
    return max;
    }
}