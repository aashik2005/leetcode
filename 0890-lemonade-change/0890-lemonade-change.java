class Solution {
    public boolean lemonadeChange(int[] bills) {
        int arr[]=new int[21];
        for(int bill:bills){
            arr[bill]++;
            int change=bill-5;
            if(change==5){
                if(arr[change]>0){
                    arr[change]--;
                }
                else{
                    return false;
                }
            }
            if(change==15){
                if(arr[10]>0 && arr[5]>0){
                    arr[10]--;
                    arr[5]--;
                }
                else if(arr[5]>=3){
                    arr[5]-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}