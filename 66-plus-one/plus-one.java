class Solution {
    public int[] plusOne(int[] digits) {
        // long num=0;
        // for(int i=0;i<digits.length;i++){
        //     num=num*10+(long)digits[i];
        // }
        // num++;
        // String st=Integer.toString((int)num);
        // int len=st.length();
        // int arr[]=new int[len];
        // long rem;
        // for(int i=len-1;i>=0;i--){
        //     rem=num%10;
        //     arr[i]=(int)rem;
        //     num=num/10;
        // }
        // return arr;
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