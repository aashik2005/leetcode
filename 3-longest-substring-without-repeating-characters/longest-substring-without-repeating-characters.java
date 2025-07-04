class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int pointer1=0, pointer2=0;
        int diff=0,max=0;
        while(pointer1<s.length()){
            map.put(s.charAt(pointer1),map.getOrDefault(s.charAt(pointer1),0)+1);
            while(map.get(s.charAt(pointer1))>1){
                map.put(s.charAt(pointer2),map.getOrDefault(s.charAt(pointer2),0)-1);
                pointer2++;
            }
             pointer1++;
            diff=pointer1-pointer2;
            max=Math.max(diff,max);
        }
        return max;
    }
}