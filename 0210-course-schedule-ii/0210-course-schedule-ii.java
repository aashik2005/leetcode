class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res=new int[numCourses];
        Queue<Integer> qu=new LinkedList<>();
        int indeg[]=new int[numCourses];
        for(int[] pre:prerequisites){
            indeg[pre[0]]++;
        }
        int idx=0;
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                qu.add(i);
                res[idx]=i;
                idx++;
            }
        }
        while(!qu.isEmpty()){
            int check=qu.poll();
            for(int[] pre:prerequisites){
                if(pre[1]==check){
                    indeg[pre[0]]--;
                    if(indeg[pre[0]]==0){
                        qu.add(pre[0]);
                        res[idx]=pre[0];
                        idx++;
                    }
                }
            }
        }
        return idx==numCourses?res:new int[]{};

    }
}