class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int val:freq){
            if(val>0){
                pq.add(val);
            }
        }
        int maxi=pq.poll();
        int extra=(maxi-1)*n;
        while(!pq.isEmpty()){
            extra-=Math.min(maxi-1,pq.poll());
        }

        return tasks.length+Math.max(0,extra);
    }
}