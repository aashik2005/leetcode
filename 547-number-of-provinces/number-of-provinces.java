class Solution {
    private void dfs(int [][] isConnected,int city,int n,boolean[] visited){
        for(int othercity=0;othercity<n;othercity++){
            if(!visited[othercity] && isConnected[city][othercity]==1){
                visited[othercity]=true;
                dfs(isConnected,othercity,n,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int province=0;
        boolean[] visited=new boolean[n];
        for(int city=0;city<n;city++){
            if(!visited[city]){
                province++;
                dfs(isConnected,city,n,visited);
            }
        }
    return province;
    }
}