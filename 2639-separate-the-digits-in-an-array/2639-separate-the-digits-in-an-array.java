class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int n:nums){
            ArrayList<Integer> arr=new ArrayList<>();
            while(n>0){
                arr.add(n%10);
                n/=10;
            }
            Collections.reverse(arr);
            for(int num:arr){
                ans.add(num);
            }
        }
        int[] val=new int[ans.size()];
        int i=0;
        for(int nu:ans){
            val[i]=nu;
            i++;
        }
        return val;
    }
}