class Solution {
    public int numberOfSpecialChars(String word) {
        int great[]=new int[26];
        int small[]=new int[26];
        for(char ch:word.toCharArray()){
            if((int)ch>96){
                great[ch-97]++;
            }
            else{
                small[ch-65]++;
            }
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(Math.min(great[i],small[i])>0){
                ans++;
            }
        }
        return ans;
    }
}