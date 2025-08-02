class Solution {
    class group{
        char ch;
        int freq;
        group(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<group> stack=new Stack<>();
        for(Character ch:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch==ch){
                int count=stack.peek().freq+1;
                stack.pop();
                if(count<k){
                    stack.push(new group(ch,count));
                }
            }
            else{
                stack.push(new group(ch,1));
            }
            
        }
        StringBuilder ans = new StringBuilder();
        for (group g : stack) {
            for (int i = 0; i < g.freq; i++) {
                ans.append(g.ch);
            }
        }
        return ans.toString();
    }
}