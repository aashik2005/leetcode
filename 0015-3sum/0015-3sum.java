class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        HashSet<List<Integer>>check = new HashSet<>();
        for(int i=0;i<n-1;i++){
            HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=i+1;j<n;j++){
                int third=(nums[i]+nums[j])*(-1);
                if(map.containsKey(third)){
                    int arr[]=new int[]{nums[i],nums[j],third};
                    Arrays.sort(arr);
                    check.add(Arrays.asList(arr[0],arr[1],arr[2]));
                }
                map.put(nums[j],1);
            }
        }
        return new ArrayList(check);
    }
}