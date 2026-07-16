class Solution {
    private int find(int[] parent,int i){
        if(parent[i]==i){
            return i;
        }
        return find(parent,parent[i]);
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length+1;
        int[] parent=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int uiloc=find(parent,u);
            int viloc=find(parent,v);
            if(uiloc==viloc){
                return e;
            }
            parent[uiloc]=viloc;
        }
        return new int[]{-1,-1};
    }
}