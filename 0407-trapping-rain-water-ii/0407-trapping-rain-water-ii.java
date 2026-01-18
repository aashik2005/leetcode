import java.util.*;

class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        int n = heightMap[0].length;
        
        if (m <= 2 || n <= 2) return 0;
        
        boolean[][] visited = new boolean[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>(
            (a, b) -> a.height - b.height
        );

        for (int i = 0; i < m; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n - 1, heightMap[i][n - 1]));
            visited[i][0] = true;
            visited[i][n - 1] = true;
        }
        
        for (int j = 0; j < n; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m - 1, j, heightMap[m - 1][j]));
            visited[0][j] = true;
            visited[m - 1][j] = true;
        }
        
        int water = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        
        // Step 2: BFS with min-heap
        while (!pq.isEmpty()) {
            Cell curr = pq.poll();
            
            for (int[] d : dirs) {
                int nx = curr.x + d[0];
                int ny = curr.y + d[1];
                
                if (nx < 0 || ny < 0 || nx >= m || ny >= n || visited[nx][ny])
                    continue;
                
                visited[nx][ny] = true;
                
                int nh = heightMap[nx][ny];
                water += Math.max(0, curr.height - nh);
                
                pq.offer(new Cell(nx, ny, Math.max(curr.height, nh)));
            }
        }
        
        return water;
    }
    
    static class Cell {
        int x, y, height;
        Cell(int x, int y, int h) {
            this.x = x;
            this.y = y;
            this.height = h;
        }
    }
}
