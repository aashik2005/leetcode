class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int e[]:edges){
            int u=e[0];
            int v=e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        Queue<Integer> qu=new LinkedList<>();
        qu.add(source);
        boolean visited[]=new boolean[n];
        visited[source]=true;
        while(!qu.isEmpty()){
            int curr=qu.poll();
            if(curr==destination){
                return true;
            }
            for(int adj:graph.get(curr)){
                if(!visited[adj]){
                    visited[adj]=true;
                    qu.add(adj);
                }
            }
        }
        return false;
    }
}