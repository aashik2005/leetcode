class Solution {
    public boolean isPowerOfTwo(long n) {
        if(n==1){
            return true;
        }
        else if(n==0){
            return false;
        }
        else{
            while(n%2==0){
                n/=2;
            }
            if(n==1){
                return true;
            }
            else{
                return false;
            }
        }
        // if (n==0)
        // return false;
        // else 
        // return (n&(n-1))==0;
    }
}