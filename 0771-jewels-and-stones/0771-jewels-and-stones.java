class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean small[]=new boolean[26];
        boolean big[]=new boolean[26];
        for(char ch:jewels.toCharArray()){
            if((int)ch>96){
                small[ch-97]=true;
            }
            else{
                big[ch-65]=true;
            }
        }
        int cnt=0;
        for(char ch:stones.toCharArray()){
            if((int)ch>96){
                if(small[ch-97]){
                    cnt++;
                }
            }
            else{
                if(big[ch-65]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}