class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Stack<int[]> st=new Stack<>();
        List<Integer> res=new ArrayList<>();
        int n=healths.length;
        int[][] pos=new int[n][2];
        for(int i=0;i<n;i++){
            pos[i][0]=positions[i];
            pos[i][1]=i;
        }
        Arrays.sort(pos,(a,b)->(a[0]-b[0]));
        for(int i=0;i<n;i++){
            int idx=pos[i][1];
            int dir=0;//R
            if(directions.charAt(idx)=='L'){
                dir=1;
            }
            int robo[]=new int[]{idx,healths[idx],dir}; // robo[number,health,direction];
            if(st.isEmpty()){
                st.push(robo);
                continue;
            }
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()[2]==0 & robo[2]==1){
                int check[]=st.pop();
                if(check[1]==robo[1]){
                    destroyed=true;
                    break;
                }
                else if(check[1]<robo[1]){
                    robo[1]-=1;
                }
                else{
                    check[1]-=1;
                    st.push(check);
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                st.push(robo);
            }
        }
        int[] result = new int[n];
        Arrays.fill(result, -1);

        while (!st.isEmpty()) {
            int[] r = st.pop();
            result[r[0]] = r[1];
        }

        for (int i = 0; i < n; i++) {
            if (result[i] != -1) {
                res.add(result[i]);
            }
        }
        return res;
    }
}