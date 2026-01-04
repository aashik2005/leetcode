class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int n:nums){
            int fact=0;
            int cnt=0;
            for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    cnt++;
                    fact+=i;
                    if((n/i)!=i){
                        cnt++;
                        fact+=n/i;
                    }
                }
            }
            if(cnt==4){
                sum+=fact;
            }
        }
        return sum;
    }
}