class Solution {
    public int maxDifference(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-97]++;
        }
        int evmax=0;
        int oddmax=0;
        int evmin=101;
        int oddmin=101;
        for(int i=0;i<26;i++){
            if(freq[i]%2==0 && freq[i]!=0){
                evmin=Math.min(evmin,freq[i]);
            }
            else if(freq[i]%2==1 && freq[i]!=0){
                oddmax=Math.max(oddmax,freq[i]);
            }
        }
        return (oddmax-evmin);
    }
}