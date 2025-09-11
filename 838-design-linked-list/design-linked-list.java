class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}


class MyLinkedList {
    ListNode newLinkedList;
    int size;
    public MyLinkedList() {
      newLinkedList=new ListNode(0);
      size=0;
    }
    
    public int get(int index) {
        ListNode head = newLinkedList.next;
        if(index>=size||size<0){
            return -1;    
        } 
        for(int i =0;i<index;i++){
            head = head.next;
        }
        return head.val;
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
           newNode.next= newLinkedList.next;
           newLinkedList.next = newNode;
           size++;
        
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode nextNode = newLinkedList;

        while(nextNode.next!=null){
            nextNode= nextNode.next;
        }
        nextNode.next =newNode;
        size++;

    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            return ;
        }
        else{
            ListNode newNode = new ListNode(val);
            ListNode curr = newLinkedList;
            for(int i =0;i<index;i++){
                curr=curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index>=size||index<0){
            return;
        }

        ListNode curr = newLinkedList;
        for(int i =0;i<index;i++){
            curr=curr.next;
        }
        curr.next = curr.next.next;
        size--;


    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */