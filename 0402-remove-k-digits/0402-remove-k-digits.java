class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st=new Stack<>();
        int n=num.length();
        if(n==k){
            return "0";
        }
        for(char digit:num.toCharArray()){
            while(!st.isEmpty() && st.peek()>digit && k>0){
                st.pop();
                k--;
            }
            st.push(digit);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        while(ans.length()>1 && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        return ans.length()==0?"0":ans.toString();
    }
}