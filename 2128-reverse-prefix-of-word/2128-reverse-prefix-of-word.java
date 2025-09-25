class Solution {
    public String reversePrefix(String word, char ch) {
        int ind=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            return word;
        }
        StringBuilder st=new StringBuilder(word.substring(0,ind+1));
        String back=word.substring(ind+1);
        return st.reverse().toString()+back;
    }
}