class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            int sum=0;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(sum-target)<=Math.abs(ans-target)){
                    ans=sum;
                }
                if(sum==target){
                    return sum;
                }
                else if(sum>target){
                    k--;;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}