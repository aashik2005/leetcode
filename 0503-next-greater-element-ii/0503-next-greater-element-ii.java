class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stck=new Stack<>();
        int len=nums.length;
        for(int i=len-1;i>=0;i--){
            stck.push(nums[i]);
        }
        int[] ans=new int[len];
        for(int i=len-1;i>=0;i--){
                while(!stck.isEmpty() && stck.peek()<=nums[i]){
                    stck.pop();
                }
                if(stck.isEmpty()){
                    ans[i]=-1;
                }
                else{
                    ans[i]=stck.peek();
                }
            stck.push(nums[i]);
        }
        return ans;
    }
}
