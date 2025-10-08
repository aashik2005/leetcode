class Solution {
    public boolean validPalindrome(String s) {
        int len=s.length();
        int i=0;
        int j=len-1;
        int cnt=0;
        boolean flag=true;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                if(cnt>0){
                    flag=false;
                }
                cnt++;
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        i=0;
        j=len-1;
        cnt=0;
        if(flag){
            return true;
        }
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                if(cnt>0){
                    return false;
                }
                cnt++;
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}