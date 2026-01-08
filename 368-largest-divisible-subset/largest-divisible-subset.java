class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        int len[]=new int[n];
        int parent[]=new int[n];
        Arrays.fill(len,1);
        Arrays.fill(parent,-1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && len[j]+1>len[i]){
                    len[i]=len[j]+1;
                    parent[i]=j;
                }
            }
        }
        int maxind=0;
        for(int i=0;i<n;i++){
            if(len[maxind]<len[i]){
                maxind=i;
            }
        }
        while(maxind!=-1){
            ans.add(nums[maxind]);
            maxind=parent[maxind];
        }
        return ans;
    }
}