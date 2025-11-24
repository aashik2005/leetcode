class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans=new ArrayList<>();
        int prefix=0;
        for(int n:nums){
            prefix=(prefix*2+n)%5;
            ans.add(prefix==0);
        }
        return ans;
    }
}