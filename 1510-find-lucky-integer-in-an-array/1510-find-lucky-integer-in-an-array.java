class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxi=-1;
        for(int i=n-1;i>=0;i--){
            if(map.get(arr[i])==arr[i]){
                maxi=Math.max(maxi,arr[i]);
            }
        }
        return maxi;
    }
}