class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=bits.length;
        int i=0;
        boolean flag=true;
        while(i<n){
            if(bits[i]==0){
                flag=true;
                i++;
            }
            else{
                flag=false;
                i+=2;
            }
        }
        return flag;
    }
}