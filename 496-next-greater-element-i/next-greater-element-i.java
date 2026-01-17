class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stck=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int len=nums2.length;
        int j=nums1.length;
        int[] ans=new int[j];
        for(int i=len-1;i>=0;i--){
                while(!stck.isEmpty() && stck.peek()<=nums2[i]){
                    stck.pop();
                }
                map.put(nums2[i],stck.isEmpty()?-1:stck.peek());
            stck.push(nums2[i]);
        }
        for(int i=0;i<j;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}