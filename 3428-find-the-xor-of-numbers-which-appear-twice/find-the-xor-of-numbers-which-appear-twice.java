class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int arr[]=new int[51];
        for(int n:nums){
            arr[n]++;
        }
        int xor=0;
        for(int i=1;i<51;i++){
            if(arr[i]==2){
                xor^=i;
            }
        }
        return xor;
    }
}