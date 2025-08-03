class Solution {
    public int maxVowels(String s, int k) {
        int start=0;
        int hash[]=new int[26];
        for(int i=0;i<k;i++){
            hash[s.charAt(i)-'a']+=1;
        }
        int value=hash[0]+hash['e'-'a']+hash['i'-'a']+hash['o'-'a']+hash['u'-'a'];
        int maxi=0;
        maxi=Math.max(maxi,value);
        for(int i=0;i+k<s.length();i++){
            hash[s.charAt(i)-'a']-=1;
            hash[s.charAt(i+k)-'a']+=1;
            value=hash[0]+hash['e'-'a']+hash['i'-'a']+hash['o'-'a']+hash['u'-'a'];
            maxi=Math.max(maxi,value);
        }
        return maxi;
    }
}