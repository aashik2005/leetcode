class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int maxi=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
                maxi=Math.max(maxi,stack.size());
            }
            else if(ch==')'){
                stack.pop();
            }
        }
        return maxi;
    }
}