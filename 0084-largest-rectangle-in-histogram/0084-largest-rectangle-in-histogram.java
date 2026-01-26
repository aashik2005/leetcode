class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        for(int i=0;i<=n;i++){
            int currh=i==n?0:heights[i];
            while(!st.isEmpty() && currh<heights[st.peek()]){
                int h=heights[st.pop()];
                int w;
                if(st.isEmpty()){
                    w=i;
                }
                else{
                    w=i-st.peek()-1;
                }
                maxarea=Math.max(w*h,maxarea);
            }
            st.push(i);
        }
        return maxarea;
    }
}