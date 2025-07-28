class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int [] freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']+=1;
                int maxi=0;
                int mini=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                    maxi=Math.max(maxi,freq[k]);
                    mini=Math.min(mini,freq[k]);
                    }
                }
                ans+=(maxi-mini);
            }
        }
        return ans;
    }
}