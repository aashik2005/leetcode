class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int odd=0;
        int total=0;
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:map.keySet()){
            int freq=map.get(ch);
            if(freq%2==0){
                total+=freq;
            }
            else{
                total+=(freq-1);
                odd=1;
            }
        }
        return total+odd;
    }
}