class Solution {
    public int numTeams(int[] rating) {
        int len=rating.length;
        int count=0;
        for(int i=0;i<len;i++){
            int num=rating[i];
            int leftlarge=0;
            int leftsmall=0;
            int rightlarge=0;
            int rightsmall=0;
            for(int j=0;j<i;j++){
                if(num<rating[j]) leftlarge++;
                if(num>rating[j]) leftsmall++;
            }
            for(int k=i+1;k<len;k++){
                if(num<rating[k]) rightlarge++;
                if(num>rating[k]) rightsmall++;
            }
            count+=leftsmall*rightlarge+leftlarge*rightsmall;
        }
        return count;
    }
}