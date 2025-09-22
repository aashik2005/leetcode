class Solution {
    public boolean checkPerfectNumber(int num) {
        int n=(int)Math.sqrt(num)+1;
        int ans=1;
        if(num==1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(num%i==0){
                ans+=i;
                ans+=(num/i);
            }
        }
        return ans==num?true:false;
    }
}