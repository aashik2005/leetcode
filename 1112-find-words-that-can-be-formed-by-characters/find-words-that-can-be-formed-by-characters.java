class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[]=new int[26];
        for(char ch:chars.toCharArray()){
            freq[ch-'a']++;
        }
        int ans=0;
        for(String str:words){
            int arr[]=new int[26];
            for(char s:str.toCharArray()){
                arr[s-'a']++;
            }
            for(int i=0;i<26;i++){
                if(freq[i]<arr[i]){
                    break;
                }
                if(i==25){
                    ans+=str.length();
                }
            }
        }
        return ans;
    }
}