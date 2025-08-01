class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> mapS=new HashMap<>();
        for(char ch:s.toCharArray()){
            mapS.put(ch,mapS.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(mapS.containsKey(ch)){
                if(mapS.get(ch)==1){
                    mapS.remove(ch);
                }
                else{
                    mapS.put(ch,mapS.get(ch)-1);
                }
            }
        }
        int count1=0;
        for(char key:mapS.keySet()){
            count1+=mapS.get(key);
        }
        return count1;
    }
}