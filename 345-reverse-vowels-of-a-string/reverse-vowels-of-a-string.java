class Solution {
    public String reverseVowels(String s) {
        String str="";
        char arr[]=s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for (char c : "AEIOUaeiou".toCharArray()) {
            set.add(c);
        }
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                str+=(String.valueOf(arr[i]));
            }
        }
        int n=str.length()-1;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                arr[i]=str.charAt(n);
                n--;
            }
        }
        return new String(arr);
    }
}