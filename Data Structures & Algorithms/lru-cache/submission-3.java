class LRUCache {
    int capacity;
    HashMap<Integer, Node> map;
    class Node {
        int key;
        int val;
        Node prev;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    Node head;
    Node tail;

    public LRUCache(int c) {
        capacity = c;
        map = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        tail.prev = head;
        head.next = tail;
    }

    private void delete(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void add(Node node) {
        node.next = head.next;
        head.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        } else {
            delete(map.get(key));
            add(map.get(key));
            return map.get(key).val;
        }
    }

    public void put(int key, int value) {
        if (!map.containsKey(key)) {
            Node node = new Node(key, value);
            add(node);
            map.put(key, node);
            if (map.size() > capacity) {
                Node lru = tail.prev;
                delete(lru);
                map.remove(lru.key);
            }
        } else {
            Node node = map.get(key);
            node.val = value;

            delete(node);
            add(node);
            map.put(key, node);
        }
    }
}
