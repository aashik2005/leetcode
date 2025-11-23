class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,int[]> map=new HashMap<>();
        int maxi=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                int arr[]=new int[]{i,i,1};
                map.put(nums[i],arr);
            }
            else{
                map.get(nums[i])[1]=i;
                map.get(nums[i])[2]+=1;
            }
            maxi=Math.max(map.get(nums[i])[2],maxi);
        }
        int ans=Integer.MAX_VALUE;
        for(int k:map.keySet()){
            if(map.get(k)[2]==maxi){
                int diff=map.get(k)[1]-map.get(k)[0];
                ans=Math.min(ans,diff+1);
            }
        }
        return ans;
    }
}