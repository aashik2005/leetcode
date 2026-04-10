class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int N=nums.length;
        for(int i=0;i<N;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int ans=Integer.MAX_VALUE;
        
        for(int key:map.keySet()){
            int res=Integer.MAX_VALUE;
            List<Integer> arr= new ArrayList<>(map.get(key));
            if(arr.size()>=3){
                int i=0;
                while(i+2<arr.size()){
                    int j=i+1;
                    int k=i+2;
                    res=Math.min(res,Math.abs(arr.get(i)-arr.get(j))+Math.abs(arr.get(k)-arr.get(j))+Math.abs(arr.get(i)-arr.get(k)));
                    i++;
                }
            }
            ans=Math.min(ans,res);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}