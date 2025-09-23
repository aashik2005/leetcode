class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<s.length();i++){
            int ind=s.charAt(i)-'a';
            if(freq[ind]==1){
                return i;
            }
        }
        return -1;
    }
}