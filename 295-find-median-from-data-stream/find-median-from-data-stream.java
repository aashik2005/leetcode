class MedianFinder {
    private PriorityQueue<Integer> minheap,maxheap;
    public MedianFinder() {
        minheap=new PriorityQueue<>();
        maxheap=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(minheap.size()==maxheap.size()){
            minheap.offer(num);
            maxheap.add(minheap.poll());
        }
        else{
            maxheap.offer(num);
            minheap.add(maxheap.poll());
        }
    }
    
    public double findMedian() {
        if(maxheap.size()==minheap.size()){
            double med=(maxheap.peek()+minheap.peek())/2.0;
            return med;
        }
        else{
            double med=maxheap.peek();
            return med;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */