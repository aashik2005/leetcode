class Solution {
    public int firstMissingPositive(int[] nums) {
        int maxval=Arrays.stream(nums).max().getAsInt();
        if(maxval<0){
            return 1;
        }
        Arrays.sort(nums);
        int index=0;        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            else{
                index=i;
                break;
            }
        }
        if(nums[index]>1){
            return 1;
        }
        for(int j=index;j<nums.length-1;j++){
            if(nums[j+1]!=nums[j]+1 && nums[j]!=nums[j+1]){
                return nums[j]+1;
            }
        }
        return maxval+1;
    }
}