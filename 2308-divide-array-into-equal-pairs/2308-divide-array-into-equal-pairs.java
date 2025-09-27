class Solution {
    public boolean divideArray(int[] nums) {
        int len=nums.length;
        int pairs=len/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ways=0;
        for(int n:map.keySet()){
            ways+=map.get(n)/2;
        }
        return ways==pairs?true:false;
    }
}