class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int exist=image[sr][sc];
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{sr,sc});
        int R=image.length;
        int C=image[0].length;
        boolean visited[][]=new boolean[R][C];
        image[sr][sc]=color;
        visited[sr][sc]=true;
        int diff[][]=new int[][]{{0,1},{0,-1},{-1,0},{1,0}};
        while(!queue.isEmpty()){
            int arr[]=queue.poll();
            for(int i=0;i<4;i++){
                int adjR=arr[0]+diff[i][0];
                int adjC=arr[1]+diff[i][1];
                if(adjR<R && adjR>=0 && adjC<C && adjC>=0 && !visited[adjR][adjC]){
                    if(image[adjR][adjC]==exist){
                        queue.add(new int[]{adjR,adjC});
                        image[adjR][adjC]=color;
                        visited[adjR][adjC]=true;
                    }
                }
            }
        }
        return image;
    }
}