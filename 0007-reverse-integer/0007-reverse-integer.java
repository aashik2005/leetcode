class Solution {
    public int reverse(int x) {
        int rev=0;
        int temp=Math.abs(x);
        while(temp>0){
            int rem=temp%10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rev=rev*10+rem;
            temp/=10;
        }
        if(x<0){
            return rev*(-1);
        }
        return rev;
    }
}