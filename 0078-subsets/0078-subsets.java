class Solution {
    private static void findSubset(int ind,int[] num,List<Integer>ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<num.length;i++){
            if(i!=ind && num[i]==num[i-1])continue;
            ds.add(num[i]);
            findSubset(i+1,num,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        findSubset(0,nums,ds,ans);
        return ans;
    }
}