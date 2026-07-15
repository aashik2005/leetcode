class Solution {
    public static void dfs(int[][] graph,int node,List<List<Integer>> res,List<Integer> way,int n){
        if(node==n){
            res.add(new ArrayList<>(way));
            return;
        }
        for(int adj:graph[node]){
            way.add(adj);
            dfs(graph,adj,res,way,n);
            way.remove(way.size()-1);
        }
        return;
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n=graph.length-1;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> way=new ArrayList<>();
        way.add(0);
        dfs(graph,0,res,way,n);
        return res;
    }
}