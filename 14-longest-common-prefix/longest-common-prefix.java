class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        boolean flag=true;
        boolean kick=true;
        for(int i=0;i<strs[0].length();i++){
            if(!flag){
                break;
            }
            char check=strs[0].charAt(i);
            flag=true;
            for(int j=1;j<strs.length;j++){
                if(strs[j].length()-1<i || strs[j].charAt(i)!=check){
                    flag=false;
                    break;
                }
            }
            if(flag)
            ans+=check;
        }
        return ans;
    }
}