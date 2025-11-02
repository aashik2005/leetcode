class Solution {
    public int myAtoi(String s) {
        int i=0;
        Long num=0L;
        int sign=1;
        int signcnt=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        while(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-'){
                sign=-1;
                signcnt++;
                i++;
            }
            else{
                sign=1;
                signcnt++;
                i++;
            }
        }
        if(signcnt>1){
            return 0;
        }

        while(i<s.length() && Character.isDigit(s.charAt(i))){
            num=num*10+(s.charAt(i)-'0');
            i++;
            if(sign>0){
                if(num>Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }
            else{
                if(-1*(num)<Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            }
        }
        return (int)(sign*num);
    }
}
