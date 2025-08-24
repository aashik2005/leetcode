class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int maxi=0;
        int i=0;
        int start=0;
        int len=s.length();
        while(i<len){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>1){
                map.put(s.charAt(start),map.get(s.charAt(start))-1);
                start++;
            }
            i++;
            maxi=Math.max(maxi,i-start);
        }
        return maxi;
    }
}