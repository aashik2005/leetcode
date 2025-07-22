class Solution {
    public String largestOddNumber(String num) {
        int size=num.length();
        for(int i=size-1;i>=0;i--){
            int number=num.charAt(i)-'0';
            if((number%2)==1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}