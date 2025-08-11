class Solution {
    private static void findCombo(int ind,int target,int arr[],List<Integer> ds,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1])continue;
            if(target<arr[i])break;
            ds.add(arr[i]);
            findCombo(i+1,target-arr[i],arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        findCombo(0,target,candidates,ds,ans);
        return ans;
    }
}