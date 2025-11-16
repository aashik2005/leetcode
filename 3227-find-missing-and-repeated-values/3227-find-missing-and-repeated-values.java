class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                map.put(grid[r][c],map.getOrDefault(grid[r][c],0)+1);
            }
        }
        int r=0;
        int m=0;
        int size=grid.length*grid[0].length;
        for(int i=1;i<=size;i++){
            if(!map.containsKey(i)){
                m=i;
            }
            else if(map.get(i)>1){
                r=i;
            }
        }
        return new int[]{r,m};
    }
}