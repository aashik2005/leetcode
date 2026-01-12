class Solution {
    private static boolean compare(String t,String s){
        if(s.length()!=t.length()+1) return false;
        int i=0,j=0;
        while(i<s.length()){
            if(j<t.length() && s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        return (i==s.length() && j==t.length());
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a, b) -> a.length() - b.length());
        int n=words.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        int maxlen=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(compare(words[j],words[i]) && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
        }
        for(int nu:dp){
             maxlen=Math.max(maxlen,nu);
        }
        return maxlen;
    }
}