class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len=nums.length;
        int ans[]=new int[len];
        int i=0,j=len-1;
        for(int n:nums){
            if(n%2==0){
                ans[i]=n;
                i++;
            }
            else{
                ans[j]=n;
                j--;
            }
        }
        return ans;
    }
}