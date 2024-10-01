class LRUCache {
    HashMap<Integer,DLL> map;
    int capacity = 0;
    DLL head = null;
    DLL tail = null;
    public LRUCache(int _capacity) {
        map = new HashMap<>();
        capacity = _capacity;
        DLL dHead = new DLL();
        dHead.prev = null;
        DLL dTail = new DLL();
        dTail.next = null;
        dHead.next = dTail;
        dTail.prev = dHead;
        head = dHead;
        tail = dTail;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }

        DLL node = map.get(key);
        deleteNode(node);
        insertFirst(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            DLL node = map.get(key);
            node.value = value;
            deleteNode(node);
            insertFirst(node);
        }else{
            if(map.size() >= capacity){
                DLL node = tail.prev;
                map.remove(node.key);
                deleteNode(node);
            }
            DLL node = new DLL();
            node.key = key;
            node.value = value;
            map.put(key,node);
            insertFirst(node);
        }
    }

    public void insertFirst(DLL node){
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void deleteNode(DLL node){
        DLL prev = node.prev;
        DLL next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    
    class DLL {
        int key;
        int value;
        DLL prev;
        DLL next;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */