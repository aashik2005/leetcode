class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                sum-=nums[j];
                set.remove(nums[j]);
                j++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;

    }
}