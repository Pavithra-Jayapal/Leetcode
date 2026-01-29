class LRUCache {
    class Node{
        int key;
        int val;
        Node pre;
        Node next;
    
    Node(int k,int v){
        this.key=k;
        this.val=v;
    }
    }
    private int capacity;
    HashMap<Integer,Node> map;
    Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.pre=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node=map.get(key);
        remove(node);
        insertofront(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            node.val=value;
            remove(node);
            insertofront(node);
        }
        else{
            if(map.size()==capacity){
                Node lru=tail.pre;
                remove(lru);
                map.remove(lru.key);
            }
            Node newnode=new Node(key,value);
            map.put(key,newnode);
            insertofront(newnode);
        }
    }
        public void remove(Node node){
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }
        public void insertofront(Node node){
            node.next=head.next;
            node.pre=head;
            head.next.pre=node;
            head.next=node;
        }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */