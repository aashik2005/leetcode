class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res=new ArrayList<Integer>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int len=words[0].length();
        int window=words.length*len;
        for(int i=0;i<len;i++){
            int left=i;
            int cnt=0;
            HashMap<String,Integer> currmap=new HashMap<>();
            for(int j=i;j+len<=s.length();j+=len){
                String rightword=s.substring(j,j+len);
                if(map.containsKey(rightword)){
                    cnt++;
                    currmap.put(rightword,currmap.getOrDefault(rightword,0)+1);
                    while(currmap.get(rightword)>map.get(rightword)){
                        String leftword=s.substring(left,left+len);
                        currmap.put(leftword,currmap.get(leftword)-1);
                        cnt--;
                        left+=len;
                    }
                    if(cnt==words.length){
                        res.add(left);
                        String leftword=s.substring(left,left+len);
                        currmap.put(leftword,currmap.get(leftword)-1);
                        left+=len;
                        cnt--;
                    }
                }
                else{
                    currmap.clear();
                    left=j+len;
                    cnt=0;
                }
            }
        }
        return res;
    }
}