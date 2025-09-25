class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String word:details){
            int len=word.length();
            String str=word.substring(len-4,len-2);
            int age=Integer.parseInt(str);
            count+=age>60?1:0;
        }
        return count;
    }
}