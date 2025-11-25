class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq=new int[101];
        int ans=0;
        for(int n:nums){
            ans+=freq[n];
            freq[n]++;
        }
        return ans;
    }
}