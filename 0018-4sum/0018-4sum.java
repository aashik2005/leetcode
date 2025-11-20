class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n-3;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j!=(i+1) && nums[j]==nums[j-1]){
                continue;
                }
                int left = j+1;
                int right=n-1;
                while(left<right){
                    long sum=(long)nums[i]+(long)nums[j]+(long)nums[left]+(long)nums[right];
                    if(sum==target){
                        List<Integer> val=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        ans.add(val);
                        right--;
                        while(left<right && nums[right]==nums[right+1]){
                            right--;
                        }
                        left++;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                    }
                    else if(sum>target){
                        right--;
                        // while(right!=0 && nums[right]==nums[right+1]){
                        //     right--;
                        // }
                    }
                    else{
                        left++;
                        // while(left!=(n-1) &&  nums[left]==nums[left-1]){
                        //     left++;
                        // }
                    }
                }
            }
        }
        return ans;
    }
}