class Solution {
    private static int find(int[] nums,int k){
        int cnt=0;
        int l=0;
        int r=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }
            //if(map.size()==k){
                cnt=cnt+(r-l+1);
            //}
            r++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return find(nums,k)-find(nums,k-1);
    }
}