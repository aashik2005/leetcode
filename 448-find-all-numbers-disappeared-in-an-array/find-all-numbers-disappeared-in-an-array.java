class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> check=new HashSet<>();
        for(int nu:nums){
            check.add(nu);
        }
        for(int i=1;i<=n;i++){
            if(!check.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}