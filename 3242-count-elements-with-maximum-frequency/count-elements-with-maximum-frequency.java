class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxfreq=0;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            maxfreq=Math.max(maxfreq,map.get(n));
        }
        int cnt=0;
        for(int num:map.keySet()){
            if(map.get(num)==maxfreq){
                cnt+=maxfreq;
            }
        }
        return cnt;
    }
}