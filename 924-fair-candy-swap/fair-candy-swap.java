class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1=0;
        int sum2=0;
        for(int a:aliceSizes)sum1+=a;
        for(int b:bobSizes)sum2+=b;
        int diff=(sum1-sum2)/2;
        HashSet<Integer> setb=new HashSet<Integer>();
        for(int n:bobSizes){
            setb.add(n);
        }
        for(int val:aliceSizes){
            int ab=val-diff;
            if(setb.contains(ab)){
                return new int[]{val,ab};
            }
        }
        return new int[0];
    }
}