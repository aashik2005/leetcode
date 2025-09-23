class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        String str="";
        int[] arr=new int[list2.length];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<list2.length;i++){
            arr[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                arr[i]=(map.get(list2[i])+i);
                if(ans>(map.get(list2[i])+i)){
                    ans=map.get(list2[i])+i;
                }
            }
        }
        int len=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans){
                len++;
            }
        }
        int k=0;
        String a[]=new String[len];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans){
                a[k]=list2[i];
                k++;
            }
        }
        return a;
    }
}