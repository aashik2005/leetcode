class Solution {
    private static void backtrack(List<List<Integer>> result,List<Integer> temp,int [] nums){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int n:nums){
            if(temp.contains(n))continue;
            temp.add(n);
            backtrack(result,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        backtrack(result,temp,nums);
        return result;
    }
}