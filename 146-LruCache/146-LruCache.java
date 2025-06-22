// Last updated: 6/22/2025, 11:04:41 AM
class LRUCache {
    class ListNode {
        int key, value;
        ListNode prev, next;

        ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    ListNode head=new ListNode(0,0);
    ListNode tail=new ListNode(0,0);
    HashMap<Integer,ListNode> map=new HashMap<>();
    int capacity;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.prev=head;
    }
    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }
        insert(new ListNode(key,value));
    }
    public void remove(ListNode node){
        map.remove(node.key);
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    public void insert(ListNode node){
        map.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */