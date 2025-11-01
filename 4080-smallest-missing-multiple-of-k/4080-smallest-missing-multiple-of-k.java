class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums){
            map.put(n,0);
        }
        int ind=0;
        for(int i=1;i<=nums.length;i++){
            if(!map.containsKey(k*i)){
                return k*i;
            }
            ind=i;
        }
        return k*(ind+1);
    }
}