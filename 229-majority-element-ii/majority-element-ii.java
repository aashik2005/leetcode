class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1=0;
        int ele2=0;
        int cnt1=0;
        int cnt2=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=ele2){
                ele1=nums[i];
                cnt1++;
            }
            else if(cnt2==0 && nums[i]!=ele1){
                ele2=nums[i];
                cnt2++;
            }
            else if(ele1==nums[i]){
                cnt1++;
            }
            else if(ele2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
            cnt1=0;
            cnt2=0;
            for(int i=0;i<n;i++){
                if(nums[i]==ele1){
                    cnt1++;
                }
                else if(nums[i]==ele2){
                    cnt2++;
                }
            }
            ArrayList<Integer> ans=new ArrayList<>();
            if(cnt1>(n/3)){
                ans.add(ele1);
            }
            if(cnt2>(n/3)){
                ans.add(ele2);
            }
        return ans;
    }
}