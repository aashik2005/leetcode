class Solution {
    private static void findCombo(int ind,int[] arr,int target,List<List<Integer>> ans,List<Integer> ds){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList(ds));
            }
            return;
        }
        if(target>=arr[ind]){
            ds.add(arr[ind]);
            findCombo(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        findCombo(ind+1,arr,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        findCombo(0,candidates,target,ans,ds);
        return ans;
    }
}