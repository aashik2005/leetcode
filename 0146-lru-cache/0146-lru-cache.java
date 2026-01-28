class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    private int capacity;
    private HashMap<Integer,Node> map;
    private Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node nn=map.get(key);
        remove(nn);
        insertTofront(nn);
        return nn.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            remove(node);
            insertTofront(node);
        }
        else{
            if(capacity==map.size()){
                Node lru=tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode=new Node(key,value);
            insertTofront(newNode);
            map.put(key,newNode);
        }
    }
    public void remove(Node nn){
        nn.prev.next=nn.next;
        nn.next.prev=nn.prev;

    }
    public void insertTofront(Node nn){
        nn.next=head.next;
        head.next.prev=nn;
        head.next=nn;
        nn.prev=head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */