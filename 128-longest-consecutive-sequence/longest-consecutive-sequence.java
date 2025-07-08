class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int cnt=0;
        int maxi=1;
        if(nums.length==0){
            return 0;
        }
        for(int num:set){
            cnt=0;
            if(!set.contains(num-1)){
                cnt++;
                int check=num;
                while(set.contains(check+1)){
                    cnt++;
                    check=check+1;
                    maxi=Math.max(maxi,cnt);
                }
            }
        }
        return maxi;
        //by sorting also it is possible to do
    }
}