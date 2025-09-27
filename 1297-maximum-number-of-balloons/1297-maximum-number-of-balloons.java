class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('b',0);
        map.put('a',0);
        map.put('l',0);
        map.put('o',0);
        map.put('n',0);
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
        }
        int a=map.get('l')/2;
        int b=map.get('o')/2;
        map.put('l',a);
        map.put('o',b);
        int ans=Integer.MAX_VALUE;
        for(char ch:map.keySet()){
            ans=Math.min(map.get(ch),ans);
        }
        return ans;
    }
}