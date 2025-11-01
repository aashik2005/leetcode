class Solution {
    public int[] decimalRepresentation(int n) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=1;
        while(n>0){
            int rem=n%10;
            int val=rem*i;
            if(val!=0){
                list.add(val);
            }
            i=i*10;
            n/=10;
        }
        int ans[]=new int[list.size()];
        int p=0;
        for(int k=list.size()-1;k>=0;k--){
            ans[p]=list.get(k);
            p++;
        }
        return ans;
    }
}