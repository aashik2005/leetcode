class Solution {
    public String longestPalindrome(String s) {
        int len=s.length();
        int strt=0;
        int end=-1;
        boolean[][] matrix=new boolean[len][len];
        for(int size=0;size<3;size++){
            for(int row=0;row<len-size;row++){
                if(s.charAt(row)==s.charAt(row+size)){
                    matrix[row][row+size]=true;
                    if(end<size){
                        end=size;
                        strt=row;
                    }
                }
            }
        }
        for(int size=3;size<len;size++){
            for(int row=0;row<len-size;row++){
                if(s.charAt(row)==s.charAt(row+size)){
                    if(matrix[row+1][row+size-1]){
                        matrix[row][row+size]=true;
                        if(end<size){
                            end=size;
                            strt=row;
                        }
                    }
                }
            }
        }
        return s.substring(strt,strt+end+1);
    }
}