class Solution {
    public String convert(String s, int numRows) {
        StringBuilder str=new StringBuilder();
        int pointer=0;
        int len=s.length();
        int rows=numRows;
        int i=0;
        if(numRows==1){
            return s;
        }
        while(pointer<numRows-1){
            int index=pointer;
            rows=numRows-pointer;
            while(index<len){
                str.append(s.charAt(index));
                index+=(rows-1)+(rows-2)+1;
                if(i!=0 && index<len){
                    str.append(s.charAt(index));
                }
                index+=i;
            }
            i+=2;
            pointer++;
        }
        while(pointer<len){
            str.append(s.charAt(pointer));
            pointer+=(2*(numRows-1));
        }
        return str.toString();
    }
}