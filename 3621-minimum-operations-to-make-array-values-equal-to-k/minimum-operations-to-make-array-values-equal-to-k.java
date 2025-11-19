class Solution {
    public int minOperations(int[] nums, int k) {
        for(int n:nums){
            if(n<k){
                return -1;
            }
        }
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            if(n>k){
                set.add(n);
            }
        }
        return set.size();
    }
}