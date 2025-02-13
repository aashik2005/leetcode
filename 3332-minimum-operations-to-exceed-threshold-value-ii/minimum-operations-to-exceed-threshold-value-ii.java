class Solution {
    public int minOperations(int [] nums, int k) {
        int size=nums.length;
        PriorityQueue<Long> heap=new PriorityQueue<>();
        for(int i=0;i<size;i++){
            heap.offer((long)nums[i]);
        }
        int count=0;
        long check=heap.peek();
        while(check<k){
            long num=(heap.poll()*2)+heap.poll();
            heap.offer(num);
            check=heap.peek();
            count++;
        }
        return count;
    }
}