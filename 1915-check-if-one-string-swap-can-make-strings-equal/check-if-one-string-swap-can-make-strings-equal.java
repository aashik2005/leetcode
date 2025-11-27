class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int index1=101;
        int index2=101;
        int cnt=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i) && cnt==0){
                index1=i;
                cnt++;
            }
            else if(s1.charAt(i)!=s2.charAt(i) && cnt==1){
                index2=i;
                cnt++;
            }
            else if(s1.charAt(i)!=s2.charAt(i)){
                cnt++;
                if(cnt>2){
                    return false;
                }
            }
        }
        if(index1==101 && index2==101){
            return true;
        }
        if(index1==101 || index2==101){
            return false;
        }
        if( s1.charAt(index1)==s2.charAt(index2) && s1.charAt(index2)==s2.charAt(index1)){
            return true;
        }
        
    return false;
    }

}