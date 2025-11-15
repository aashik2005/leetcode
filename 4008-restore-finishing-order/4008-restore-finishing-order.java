class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:friends){
            map.put(n,0);
        }
        int i=0;
        int[] arr=new int[friends.length];
        for(int n:order){
            if(map.containsKey(n)){
                arr[i]=n;
                i++;
            }
        }
        return arr;
    }
}