class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int diff;
        int currsum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            currsum+=nums[i];
            diff=currsum-k;
            count+=map.getOrDefault(diff,0);
            map.put(currsum,map.getOrDefault(currsum,0)+1);           
        }
        return count;
    }
}