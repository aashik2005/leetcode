class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        int freq[]=new int[26];
        for(char ch:row1.toCharArray()){
            freq[ch-'a']=1;
        }
        for(char ch:row2.toCharArray()){
            freq[ch-'a']=10;
        }
        String[] arr=new String[words.length];
        int idx=0;
        for(String str:words){
            int num=0;
            int len=str.length();
            for(char ch:str.toCharArray()){
                if(ch>='a'){
                    num+=freq[ch-'a'];
                }
                else{
                    num+=freq[ch-'A'];
                }
            }
            if(num==0 || num==len || num==10*len){
                // System.out.println(num +" "+len);
                arr[idx]=str;
                idx++;
            }
        }
        String[] ans = Arrays.copyOfRange(arr, 0, idx);
        return ans;
    }
}