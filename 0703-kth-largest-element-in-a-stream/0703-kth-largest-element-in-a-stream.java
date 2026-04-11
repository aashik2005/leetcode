class KthLargest {
    PriorityQueue<Integer> heap;
    int limit;
    public KthLargest(int k, int[] nums) {
        heap=new PriorityQueue<>();
        limit=k;
        for(int n:nums){
            heap.add(n);
        }
        while(heap.size()>k){
            heap.poll();
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size()>limit){
            heap.poll();
        }
        
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */