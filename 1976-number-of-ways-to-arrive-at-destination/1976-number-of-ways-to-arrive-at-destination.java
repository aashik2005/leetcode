class Solution {
    // private static int dfs(int[][] graph,int dest,int node,int cost,boolean[] visited){
    //     if(node==dest && cost>=0){
    //         return 1;
    //     }
    //     int ways=0;
    //     for(int i=0;i<graph.length;i++){
    //         if(graph[node][i]!=0 && !visited[i] && cost>=graph[node][i]){
    //             visited[i]=true;
    //             ways+=dfs(graph,dest,i,cost-graph[node][i],visited);
    //             visited[i]=false;
    //         }
    //     }
    //     return ways;
    // }
    public int countPaths(int n, int[][] roads) {
        int mod = (int) (1e9 + 7);
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] r : roads) {
            int u = r[0];
            int v = r[1];
            int w = r[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        int[] ways = new int[n];
        dist[0] = 0;
        ways[0] = 1;

        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
        pq.add(new long[]{0, 0});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            int node = (int) curr[0];
            long dis = curr[1];

            if (dis > dist[node])
                continue;

            for (int[] adj : graph.get(node)) {
                int adjNode = adj[0];
                int wt = adj[1];
                if (dist[adjNode] > dis + wt) {
                    dist[adjNode] = dis + wt;
                    ways[adjNode] = ways[node];
                    pq.add(new long[]{adjNode, dist[adjNode]});
                }
                else if (dist[adjNode] == dis + wt) {
                    ways[adjNode] =(ways[adjNode] + ways[node]) % mod;
                }
            }
        }
        return ways[n - 1];
        // dfs approach leads to TLE
        // boolean visited[]=new boolean[n];
        // visited[0]=true;
        // int res=dfs(graph,n-1,0,dist[n-1],visited);
        // System.out.println(res);
        // return res;
    }
}