class Solution {
    public int minOperations(int[] nums, int x) {
        int totalsum=0;
        int len=nums.length;
        for(int num:nums){
            totalsum+=num;
        }
        int target=totalsum-x;
        int left=0;
        int  val=0;
        int maxi=-1;
        for(int right=0;right<len;right++){
            val+=nums[right];
            while(val>target && left<=right){
                val-=nums[left];
                left++;
            }
            if(target==val){
                maxi=Math.max(maxi,(right-left)+1);
            }
        }
        return maxi==-1?-1:len-maxi;
    }
}