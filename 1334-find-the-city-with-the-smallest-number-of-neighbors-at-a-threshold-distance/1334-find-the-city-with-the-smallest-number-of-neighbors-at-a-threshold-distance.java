class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        //use floyd warshall find multi source distance, if dist <=treshhold count it and return the maximum count among from cities
        int dist[][]=new int[n][n];
        int INF=Integer.MAX_VALUE;
        for(int d[]:dist){
            Arrays.fill(d,INF);
        }
        for(int i=0;i<n;i++){
            dist[i][i]=0;
        }
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            int w=e[2];
            dist[u][v]=w;
            dist[v][u]=w;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(dist[i][k] != INF && dist[k][j]!= INF) 
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        int res=Integer.MAX_VALUE;
        int sumof[]=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                if(i!=j && dist[i][j]<=distanceThreshold){
                    sum++;
                }
            }
            sumof[i]=sum;
            res=Math.min(res,sum);
        }
        for(int i=n-1;i>=0;i--){
            if(sumof[i]==res){
                return i;
            }
        }
        return res;
    }
}