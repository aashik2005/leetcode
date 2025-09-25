class Solution {
    private static String reverse(String str){
        String ans="";
        int j=str.length()-1;
        for(int i=j;i>=0;i--){
            ans+=str.charAt(i);
        }
        return ans;
    }
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            String str=reverse(arr[i]);
            arr[i]=str;
        }
        String ans="";
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
            ans+=" ";
        }
        return ans.trim();
    }
}