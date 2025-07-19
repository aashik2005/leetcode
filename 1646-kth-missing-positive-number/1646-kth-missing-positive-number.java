class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length-1;
        int num=arr[n]+k;
        HashSet<Integer> set=new HashSet<>();
        for(int val:arr){
            set.add(val);
        }
        for(int i=1;i<=num;i++){
            if(!set.contains(i)){
                k--;
                if(k==0){
                    return i;
                }
            }
        }
        return 1;
    }
}