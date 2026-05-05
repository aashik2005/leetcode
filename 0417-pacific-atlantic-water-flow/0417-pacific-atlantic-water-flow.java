import java.util.*;

class Solution {
    class Pair {
        int x, y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};

    private void bfs(int[][] heights, Queue<Pair> qu, int N, int M, boolean[][] visited) {
        while (!qu.isEmpty()) {
            Pair cur = qu.poll();

            for (int i = 0; i < 4; i++) {
                int adjx = cur.x + dir[i][0];
                int adjy = cur.y + dir[i][1];

                if (adjx >= 0 && adjy >= 0 && adjx < N && adjy < M &&
                    !visited[adjx][adjy] &&
                    heights[cur.x][cur.y] <= heights[adjx][adjy]) {

                    visited[adjx][adjy] = true;
                    qu.add(new Pair(adjx, adjy));
                }
            }
        }
    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int N = heights.length;
        int M = heights[0].length;

        boolean[][] visited1 = new boolean[N][M];
        boolean[][] visited2 = new boolean[N][M];

        Queue<Pair> q1 = new LinkedList<>();
        Queue<Pair> q2 = new LinkedList<>();
        for (int i = 0; i < M; i++) {
            q1.add(new Pair(0, i));
            visited1[0][i] = true;
        }
        for (int i = 0; i < N; i++) {
            q1.add(new Pair(i, 0));
            visited1[i][0] = true;
        }
        for (int i = 0; i < M; i++) {
            q2.add(new Pair(N - 1, i));
            visited2[N - 1][i] = true;
        }
        for (int i = 0; i < N; i++) {
            q2.add(new Pair(i, M - 1));
            visited2[i][M - 1] = true;
        }

        bfs(heights, q1, N, M, visited1);
        bfs(heights, q2, N, M, visited2);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (visited1[i][j] && visited2[i][j]) {
                    res.add(Arrays.asList(i, j)); 
                }
            }
        }

        return res;
    }
}