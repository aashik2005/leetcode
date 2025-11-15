class Solution {
    public int smallestAbsent(int[] nums) {
        float val=0;
        int[] num=new int[102];
        int len=nums.length;
        for(int n:nums){
            val+=n;
            if(n>0)
            num[n]++;
        }
        val=val/len;
        if(val<0) val=0;
        for(int i=(int)val+1;i<102;i++){
            if(num[i]==0){
                return i;
            }
        }
        return 1;
    }
}