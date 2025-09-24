class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i-1);
            char check=s.charAt(i);
            if(Character.toLowerCase(ch)!=Character.toLowerCase(check)){
                count++;
            }
        }
        return count;
    }
}