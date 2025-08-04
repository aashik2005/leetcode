class Solution {
    public int subarraySum(int[] nums, int k) {
        int currsum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            int diff=currsum-k;
            cnt+=map.getOrDefault(diff,0);
            map.put(currsum,map.getOrDefault(currsum,0)+1);
        }
        return cnt;
    }
}