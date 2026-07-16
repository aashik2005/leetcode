class Solution {
    private int gcd(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a<b) return gcd(a,b%a);
        else return gcd(a%b,b);
    }
    public long gcdSum(int[] nums) {
        long res=0;
        int n=nums.length;
        int[] mx=new int[n];
        mx[0]=nums[0];
        for(int i=1;i<n;i++){
            mx[i]=Math.max(mx[i-1],nums[i]);
        }
        int[] prefixGcd=new int[n];
        for(int i=0;i<n;i++){
            prefixGcd[i]=gcd(mx[i],nums[i]);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=prefixGcd.length-1;
        while(i<j){
            res+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return res;
    }
}