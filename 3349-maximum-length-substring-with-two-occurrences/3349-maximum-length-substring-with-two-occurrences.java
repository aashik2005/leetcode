class Solution {
    public int maximumLengthSubstring(String s) {
        int len=0;
        int maxlen=0;
        int left=0,right=0;
        int n=s.length();
        int[] hash=new int[26];
        while(right<n){
            int ind=s.charAt(right)-'a';
            hash[ind]++;
            while(hash[ind]>2){
                int i=s.charAt(left)-'a';
                hash[i]--;
                left++;
            }
            len=right-left+1;
            maxlen=Math.max(len,maxlen);
            right++;
        }
        return maxlen;
    }
}