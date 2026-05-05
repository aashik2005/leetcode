class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(target>x+y){
            return false;
        }
        int pair[]=new int[]{0,0};
        Queue<int[]> qu=new LinkedList<>();
        qu.add(new int[]{0,0});
        HashSet<String> set=new HashSet<>();
        while(!qu.isEmpty()){
            int curr[]=qu.poll();
            int a=curr[0];
            int b=curr[1];
            if(a+b==target){
                return true;
            }
            String state=a+"-"+b;
            if(set.contains(state))continue;
            set.add(state);

            qu.add(new int[]{x,b});

            qu.add(new int[]{a,y});

            qu.add(new int[]{0,b});

            qu.add(new int[]{a,0});

            int pourXY = Math.min(a, y - b);
            qu.add(new int[]{a - pourXY, b + pourXY});

            int pourYX = Math.min(b, x - a);
            qu.add(new int[]{a + pourYX, b - pourYX});
        }
        return false;
    }
}