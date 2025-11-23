class Solution {
    public List<String> commonChars(String[] words) {
        int freq[]=new int[26];
        for(char ch:words[0].toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=1;i<words.length;i++){
            int hash[]=new int[26];
            for(char ch:words[i].toCharArray()){
                hash[ch-'a']++;
            }
            for(int j=0;j<26;j++){
                freq[j]=Math.min(freq[j],hash[j]);
            }
        }
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(freq[i]!=0){
                arr.add(String.valueOf((char)('a'+i)));
                freq[i]--;
            }
        }
        return arr;
    }
}