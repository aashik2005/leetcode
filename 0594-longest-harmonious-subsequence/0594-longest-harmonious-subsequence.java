class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(int n:nums){
            if(map.containsKey(n-1)){
                sum=Math.max(sum,map.get(n)+map.get(n-1));
            }
        }
        return sum;
    }
}