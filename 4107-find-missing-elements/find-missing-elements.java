class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        int len=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        boolean arr[]=new boolean[101];
        for(int n:nums){
            arr[n]=true;
            mini=Math.min(mini,n);
            maxi=Math.max(maxi,n);
        }
        for(int i=mini;i<=maxi;i++){
            if(!arr[i]){
                list.add(i);
            }
        }
        return list;
    }
}