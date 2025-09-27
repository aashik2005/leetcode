class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq=new int[26];
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            int ind=ch-'a';
            freq[ind]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            int ind=ch-'a';
            if(freq[ind]==0){
                return false;
            }
            freq[ind]--;
        }
        return true;
    }
}