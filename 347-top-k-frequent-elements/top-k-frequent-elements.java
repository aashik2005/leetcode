class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,List<Integer>> freqmap=new HashMap<>();
        for(int num:map.keySet()){
            int count=map.get(num);
            if(!freqmap.containsKey(count)){
                freqmap.put(count,new ArrayList<>());
            }
            freqmap.get(count).add(num);
        }
        int ind=0;
        for(int i=n;i>0;i--){
            if(ind<k){
            if(freqmap.containsKey(i)){
                for(int j=0;j<freqmap.get(i).size();j++){
                    if(ind<k){
                        ans[ind]=freqmap.get(i).get(j);
                        ind++;
                    }
                    else{
                        return ans;
                    }
                }
            }
        }
        else{
            return ans;
        }
    }
    return  ans;
    }
}