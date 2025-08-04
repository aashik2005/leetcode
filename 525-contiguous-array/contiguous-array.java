class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int maxvalue=0;
        int counter=0;
        for(int ctr=0;ctr<nums.length;ctr++){
            if(nums[ctr]==0){
                counter--;
            }
            else{
                counter++;
            }
            if(map.containsKey(counter)){
                int currlen=ctr-map.get(counter);
                maxvalue=Math.max(maxvalue,currlen);
            }
            else{
                map.put(counter,ctr);
            }
        }
        return maxvalue;
    }
}