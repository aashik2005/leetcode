class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int rem,rev=0;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(rev==temp)return true;
        else return false;
    }
}