class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[1]-b[1]));
        int cnt=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<intervals[i-1][1]){
                intervals[i]=intervals[i-1];
                cnt++;
            }
        }
        return cnt;
    }
}