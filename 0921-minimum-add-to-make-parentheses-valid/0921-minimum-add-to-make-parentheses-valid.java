class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int close=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            else{
                close++;
                if(!stack.isEmpty()){
                    stack.pop();
                    close--;
                }
            }
        }
        return stack.size()+close;
    }
}