class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> list=new ArrayList<>();
        for(int[] inter:intervals){
            if(list.isEmpty() || list.get(list.size()-1)[1]<inter[0]){
                list.add(inter);
            }
            else{
                int arr[]=list.get(list.size()-1);
                arr[1]=Math.max(arr[1],inter[1]);
                list.remove(list.size()-1);
                list.add(arr);
            }
        }
        int[][] ans=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}