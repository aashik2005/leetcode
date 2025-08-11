class Solution {
    private static void findSubset(int ind,int N,int arr[],List<Integer> ds,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<N;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            findSubset(i+1,N,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        int N=nums.length;
        findSubset(0,N,nums,ds,ans);
        return ans;
    }
}