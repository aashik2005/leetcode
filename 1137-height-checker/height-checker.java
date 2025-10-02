class Solution {
    public int heightChecker(int[] heights) {
        int reverse[]=heights.clone();
        Arrays.sort(reverse);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=reverse[i]){
                ans++;
            }
        }
        return ans;
    }
}