class Solution {
    public void duplicateZeros(int[] arr) {
        int num[]=new int[arr.length];
        int k=0;
        int i=0;
        while(i<arr.length){
            if(arr[k]!=0){
                num[i]=arr[k];
                i++;
                k++;
            }
            else{
                i+=2;
                k++;
            }
        }
        i=0;
        for(int n:num){
            arr[i]=n;
            i++;
        }
    }
}