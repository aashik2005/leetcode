class Solution {
    private boolean isVowel(char c) {
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
               c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
    public String reverseVowels(String s) {
        String str="";
        char arr[]=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                str+=(String.valueOf(arr[i]));
            }
        }
        int n=str.length()-1;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=str.charAt(n);
                n--;
            }
        }
        return new String(arr);
    }
}