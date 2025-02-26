class Solution {
    public int maximumSwap(int num) {
        String str=Integer.toString(num);
        int n=str.length();
        int arr[]=new int[n];
        int i=n-1;
        while(num>0){
            int rem=num%10;
            num/=10;
            arr[i]=rem;
            i--;
        }
        for(int k=0;k<n;k++){
            int min=k;
            for(int p=(n-1);p>k;p--){
                if(arr[min]<arr[p]){
                    min=p;
                }
            }
            if(arr[k]<arr[min]){
                int temp=arr[min];
                    arr[min]=arr[k];
                    arr[k]=temp;
                    break;
            }
        }
        int ans=0;
        for(int j=0;j<n;j++){
            ans=ans*10+arr[j];
        }
        return ans;
    }
}