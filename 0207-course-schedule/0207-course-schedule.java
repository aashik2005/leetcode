class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        for(int[] pre:prerequisites){
            indegree[pre[0]]++;
        }
        Queue<Integer> qu=new LinkedList<>();
        int cnt=0;
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                qu.add(i);
                cnt++;
            }
        }
        while(!qu.isEmpty()){
            int check=qu.poll();
            for(int[] pre:prerequisites){
                if(check==pre[1]){
                    indegree[pre[0]]--;
                    if(indegree[pre[0]]==0){
                        qu.add(pre[0]);
                        cnt++;
                    }
                }
            }
        }
        return numCourses==cnt;
    }
}