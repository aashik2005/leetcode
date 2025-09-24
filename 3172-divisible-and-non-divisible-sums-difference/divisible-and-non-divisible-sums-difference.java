class Solution {
    public int differenceOfSums(int n, int m) {
        boolean[] div=new boolean[n+1];
        boolean[] nodiv=new boolean[n+1];
        for(int i=1;i<=n;i++){
            if(i%m==0){
                div[i]=true;
            }
            else{
                nodiv[i]=true;
            }
        }
        int divi=0;
        int nodivi=0;
        for(int i=1;i<=n;i++){
            if(div[i]){
                divi+=i;
            }
            else{
                nodivi+=i;
            }
        }
        return nodivi-divi;
    }
}