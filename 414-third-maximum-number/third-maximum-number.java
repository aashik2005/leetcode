class Solution {
    public int thirdMax(int[] nums) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int n:nums){
            if(first<n){
                first=n;
            }
        }
        for(int n:nums){
            if(second<n && n!=first){
                second=n;
            }
        }
        boolean flag=false;
        for(int n:nums){
            if(third<=n && n!=first && n!=second){
                flag=true;
                third=n;
            }
        }
        if(flag)
        return third;
        else
        return first;
    }
}