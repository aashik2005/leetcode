class Solution {
    public int maxFreqSum(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-97]++;
            
        }
        int vow=0;
        int con=0;
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vow=Math.max(freq[i],vow);
            }
            else{
                con=Math.max(freq[i],con);
            }
        }
        return con+vow;
    }
}