class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(n%2==0){
                map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        int ans=-1;
        int maxi=0;
        for(int key:map.keySet()){
            if(maxi<map.get(key)){
                maxi=map.get(key);
                ans=key;
            }
            else if(maxi==map.get(key) && ans>key){
                ans=key;
            }
        }
        return ans;
    }
}