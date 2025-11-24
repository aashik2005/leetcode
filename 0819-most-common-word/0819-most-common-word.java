class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set=new HashSet<>();
        for(String str:banned){
            set.add(str);
        }
        String words[]=paragraph.split("[\\s!?',;.]+");
        HashMap<String,Integer> map=new HashMap<>();
        int maxi=0;
        for(String word:words){
            if(!set.contains(word.toLowerCase())){
                map.put(word.toLowerCase(),map.getOrDefault(word.toLowerCase(),0)+1);
                maxi=Math.max(maxi,map.get(word.toLowerCase()));
            } 
        }
        for(String key:map.keySet()){
            if(map.get(key)==maxi){
                return key;
            }
        }
        return "";
    }
}