class Solution {
    public String winningPlayer(int x, int y) {
        int large=x;
        int small=y/4;
        int ans=Math.min(large,small);
        return ans%2==0?"Bob":"Alice";
    }
}