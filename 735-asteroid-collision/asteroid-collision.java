class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st=new Stack<>();
        for(int ast:asteroids){
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()>0 && ast<0){
                if(st.peek()<Math.abs(ast)){
                    st.pop();
                    continue;
                }
                else if(st.peek()==Math.abs(ast)){
                    st.pop();
                }
                destroyed=true;
                break;
            }
            if(!destroyed){
                st.push(ast);
            }
        }
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }
        return result;
    }
}