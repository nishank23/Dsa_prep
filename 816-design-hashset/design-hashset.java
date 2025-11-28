class ListNode{
    ListNode next;
    int val;
    ListNode(ListNode next,int val){
        this.next = next;
        this.val = val;
    }
    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class MyHashSet {
    ListNode dummyNode = null;
    int size;
    public MyHashSet() {
        dummyNode = new ListNode(-1);
        size = 0;
    }
    
    public void add(int key) {
        ListNode newNode = new ListNode(key);
        ListNode curr = dummyNode;
        if(curr==null){
            curr.next = newNode;
            return;
        }
        while(curr.next!=null){
            curr = curr.next;
        }
        if(!contains(key)){
            curr.next = newNode;
            size++;

        }
    }
    
    public void remove(int key) {
        ListNode curr = dummyNode;
        if(size==0){
            return;
        }
        while(curr !=null && curr.next!=null){
            if(curr.next.val == key){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
           
        }
        size--;
    }
    
    public boolean contains(int key) {
        ListNode curr = dummyNode.next;
        while(curr !=null){
            if(curr.val==key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */