class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0;
        int odd=0;
        for(int i=1;i<2*n;i+=2){
            odd+=i;
        }
        for(int i=2;i<=2*n;i+=2){
            even+=i;
        }
        int a=even;
        int b=odd;
        while(a!=0 && b!=0){
            if(a<b){
                b=b%a;
            }
            else{
                a=a%b;
            }
        }
        if(a==0){
            return b;
        }
        return a;
    }
}