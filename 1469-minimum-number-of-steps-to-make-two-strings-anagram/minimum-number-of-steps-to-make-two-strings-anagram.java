class Solution {
    public int minSteps(String s, String t) {
        int [] arr1=new int[26];
        int [] arr2=new int[26];
        for(char ch:s.toCharArray()){
            arr1[ch-'a']+=1;
        }
        for(char ch:t.toCharArray()){
            arr2[ch-'a']+=1;
        }
        int count=0;
        for(int i=0;i<26;i++){
            count+=Math.abs(arr1[i]-arr2[i]);
        }
        return count/2;
    }
}