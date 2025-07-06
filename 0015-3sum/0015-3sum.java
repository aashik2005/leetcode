class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        // HashSet<List<Integer>>check = new HashSet<>();
        // for(int i=0;i<n-1;i++){
        //     HashMap<Integer,Integer>map=new HashMap<>();
        //     for(int j=i+1;j<n;j++){
        //         int third=(nums[i]+nums[j])*(-1);
        //         if(map.containsKey(third)){
        //             int arr[]=new int[]{nums[i],nums[j],third};
        //             Arrays.sort(arr);
        //             check.add(Arrays.asList(arr[0],arr[1],arr[2]));
        //         }
        //         map.put(nums[j],1);
        //     }
        // }
        // return new ArrayList(check);
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    k--;
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;
                }
                while(j<k && nums[k]==nums[k+1]){
                        k--;
                }
                }
                else if(sum>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans;
    }
}