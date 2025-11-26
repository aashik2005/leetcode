class Solution {
    private static boolean check(char ch){
        int val=(int)(ch);
        return (val<65 || (val>90 && val<97));
    }
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!check(ch[i]) && !check(ch[j])){
                char chr=ch[i];
                ch[i]=ch[j];
                ch[j]=chr;
                i++;
                j--;
            }
            else if(check(ch[i])){
                i++;
            }
            else if(check(ch[j])){
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        return new String(ch);
    }
}