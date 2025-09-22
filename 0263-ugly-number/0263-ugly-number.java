class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        while(n%5==0 || (n%3==0) || n%2==0){
            if(n%5==0){
                n=n/5;
            }
            else if(n%3==0){
                n=n/3;
            }
            else{
                n=n/=2;
            }
        }
        return n==1?true:false;
    }
}