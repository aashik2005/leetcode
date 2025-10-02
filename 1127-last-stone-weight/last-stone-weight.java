class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int n:stones){
            maxheap.add(n);
        }
        while(maxheap.size()>1){
            int x=maxheap.poll();
            int y=maxheap.poll();
            maxheap.add(x-y);
        }
        return maxheap.poll();
    }
}