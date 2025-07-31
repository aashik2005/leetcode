class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                set2.add(n);
            }
            set.add(n);
        }
        for(int nu:set2){
            list.add(nu);
        }
        return list;
    }
}