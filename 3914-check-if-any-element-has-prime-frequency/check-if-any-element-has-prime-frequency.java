class Solution {
    private static boolean prime(int val){
        for(int i=2;i*i<=val;i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        int freq[]=new int[101];
        for(int n:nums){
            freq[n]++;
        }

        for(int i=0;i<101;i++){
            if(freq[i]>1 && prime(freq[i])){
                return true;
            }
        }
        return false;
    }
}