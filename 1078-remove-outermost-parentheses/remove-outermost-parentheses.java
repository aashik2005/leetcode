class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        String ans="";
        int ind=0;
        int count=0;
        while(ind<n){
            if(s.charAt(ind)=='('){
                if(count>=1){
                    ans+='(';
                }
                count++;
                ind++;
            }
            else{
                if(count>1){
                    ans+=')';
                }
                count--;
                ind++;
            }
        }
        return ans;
    }
}