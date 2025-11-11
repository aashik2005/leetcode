class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int size=nums.length;
        int subset=1<<size;
        List<List<Integer>> ans=new ArrayList<>();
        for(int num=0;num<subset;num++){
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                if((num&(1<<i))!=0){
                    arr.add(nums[i]);
                }
            }
            ans.add(arr);
        }
        return ans;
    }
}