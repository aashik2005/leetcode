class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String st=words[i];
            if(st.contains(String.valueOf(x))){
                ans.add(i);
            }
        }
    return ans;
    }
}