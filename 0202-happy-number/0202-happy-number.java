class Solution {
    public boolean isHappy(int n) {
        while(n>5){
            int temp=0;
            while(n>0){
                int r=n%10;
                temp+=(r*r);
                n/=10;
            }
            n=temp;
        }
        return n==1?true:false;
    }
}