class Solution {
    public String longestCommonPrefix(String[] strs) {
        // String ans="";
        // boolean flag=true;
        // boolean kick=true;
        // for(int i=0;i<strs[0].length();i++){
        //     if(!flag){
        //         break;
        //     }
        //     char check=strs[0].charAt(i);
        //     flag=true;
        //     for(int j=1;j<strs.length;j++){
        //         if(strs[j].length()-1<i || strs[j].charAt(i)!=check){
        //             flag=false;
        //             break;
        //         }
        //     }
        //     if(flag)
        //     ans+=check;
        // }
        // return ans;
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        String ans="";
        int i=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(i)){
                ans+=s1.charAt(i);
                i++;
            }
            else{
                break;
            }
        }
        return ans;
    }
}