class Solution {
    public int[] evenOddBit(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        while(n>0){
            ans.add(n%2);
            n/=2;
        }
        int even=0;
        int odd=0;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==1){
                if(i%2==0)even++;
                else odd++;
            }        
        }
        return new int[]{even,odd};
    }
}