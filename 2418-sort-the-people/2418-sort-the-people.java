class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],i);
        }
        String ans[]=new String[names.length];
        int ind=0;
        for(int key:map.keySet()){
            ans[ind]=names[map.get(key)];
            ind++;
        }
        return ans;
    }
}