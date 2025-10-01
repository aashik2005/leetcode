class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        int cnt=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==letter){
                cnt++;
            }
        }
        if(cnt==0){
            return 0;
        }
        return cnt*100/n;
    }
}