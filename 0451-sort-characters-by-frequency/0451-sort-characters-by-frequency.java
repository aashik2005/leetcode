class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        List<Character> list=new ArrayList<>(freq.keySet());
        list.sort((a,b) -> freq.get(b)-freq.get(a));
        StringBuilder str=new StringBuilder();
        for(char c:list){
            for(int i=0;i<freq.get(c);i++){
                str.append(c);
            }
        }
        return str.toString();
    }
}