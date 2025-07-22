class Solution {
    public String reverseWords(String s) {
        String str=s.trim();
        String ans="";
        String arr[]=s.split("\\s+");
        for(int i=arr.length-1;i>=0;i--){
            ans+=arr[i];
            ans+=" ";
        }
        System.out.println(ans);
        return ans.trim();
    }
}