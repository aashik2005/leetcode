class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> ans=new ArrayList<>();
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String str:strs){
            int arr[]=new int[26];
            char[] st=str.toCharArray();
            for(char s:st){
                arr[s-'a']+=1;
            }
            String key=Arrays.toString(arr);
            map.computeIfAbsent(key,k-> new ArrayList<>()).add(str);
        }
        for(String keys:map.keySet()){
            ans.add(map.get(keys));
        }
        return ans;
    }
}