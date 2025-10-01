class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        int great=candies[0];
        for(int n:candies){
            great=Math.max(n,great);
        }
        int len=candies.length;
        List<Boolean> ans=new ArrayList<>();
        for(int n:candies){
            if(n+extra>=great){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}