class Solution {
    public int countDigits(int num) {
        int n=num;
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans+=num%rem==0?1:0;
            n/=10;
        }
        return ans;
    }
}