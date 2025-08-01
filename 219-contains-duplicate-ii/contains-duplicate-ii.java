class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        k+=1;
        while(i<k && i<nums.length){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            i++;
        }
        for(int p=0;(p+k)<nums.length;p++){
            set.remove(nums[p]);
            if(set.contains(nums[p+k])){
                return true;
            }
            set.add(nums[p+k]);
        }
        return false;
    }
}