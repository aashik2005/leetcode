class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int N=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(nums[i]==target)
            ans=Math.min(ans,Math.abs(start-i));
        }

        return ans;
    }
}