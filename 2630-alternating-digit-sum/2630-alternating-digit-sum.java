class Solution {
    public int alternateDigitSum(int n) {
        String str=String.valueOf(n);
        int len=str.length();
        int sum=0;
        if(len%2==0){
            int i=2;
            while(n>0){
                int rem=n%10;
                if(rem!=0){
                sum+=i%2==0?(-1*rem):rem;
                }
                n/=10;
                i++;
            }
        }
        else{
            int i=1;
            while(n>0){
                int rem=n%10;
                if(rem!=0){
                sum+=i%2==0?-1*(rem):rem;
                }
                n/=10;
                i++;
            }
        }
        return sum;
    }
}