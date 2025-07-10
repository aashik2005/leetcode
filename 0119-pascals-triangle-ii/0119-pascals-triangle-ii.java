class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        int row=rowIndex+1;
        long val=1;
        for(int i=0;i<row;i++){
            if(i==0||i==row-1){
                ans.add(1);
            }
            else{
                val=val*(row-i);
                val=val/i;
                ans.add((int)val);
            }
        }
        return ans;
    }
}