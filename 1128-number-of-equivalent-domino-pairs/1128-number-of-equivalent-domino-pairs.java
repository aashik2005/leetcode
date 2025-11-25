class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> map=new HashMap<>();
        int ans=0;
        for(int[] pair:dominoes){
            Arrays.sort(pair);
            String str=pair[0]+"-"+pair[1];
            if(map.containsKey(str)){
                ans+=map.get(str);
            }
            map.put(str,map.getOrDefault(str,0)+1);
        }
        return ans;
    }
}