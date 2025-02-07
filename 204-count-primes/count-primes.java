class Solution {
    public int countPrimes(int n) {
        int check[]=new int[n+1];
        for(int ptr=2;ptr<n+1;ptr++){
            check[ptr]=1;
        }
        for(int i=2;i*i<n;i++){
            if(check[i]==1){
                for(int j=i*i;j<n;j+=i){
                    check[j]=0;
                }
            }
        }
        int number=0;
        for(int st=0;st<n;st++){
            if(check[st]==1){
                number++;
            }
        }
        return number;
    }
}