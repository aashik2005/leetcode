class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> valid=new ArrayList<>();
        for(int[] interval : intervals){
            if(valid.isEmpty() || valid.get(valid.size()-1)[1]<interval[0]){
                valid.add(interval);
            }
            else{
                valid.get(valid.size()-1)[1]=Math.max(valid.get(valid.size()-1)[1],interval[1]);
            }
        }

        return valid.toArray(new int[valid.size()][]);
    }
}