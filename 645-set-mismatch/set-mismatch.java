class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans=new int[2];
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int len=nums.length;
        for(int i=1;i<=len;i++){
            if(!map.containsKey(i)){
                ans[1]=i;
            }
            else if(map.get(i)>1){
                ans[0]=i;
            }
        }
        return ans;
    }
}