class Solution {
    public int[] plusOne(int[] digits) {
        int len=digits.length-1;
        for(int i=len;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] arr=new int[len+2];
        arr[0]=1;
        for(int i=0;i<=len;i++){
            arr[i+1]=digits[i];
        }
        return arr;
    }
}