class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            int n=i;
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem;
                n/=10;
            }
            count+=sum%2==0?1:0;
        }
        return count;
    }
}