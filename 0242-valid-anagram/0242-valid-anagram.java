class Solution {
    public boolean isAnagram(String s, String t) {
        int size1=s.length();
        int size2=t.length();
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        if(size1!=size2){
            return false;
        }
        for(int i=0;i<size1;i++){
            arr1[s.charAt(i)-'a']+=1;
            arr2[t.charAt(i)-'a']+=1;
        }
        for(int i=0;i<26;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}