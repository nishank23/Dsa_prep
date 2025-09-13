class MyStack {
    Deque<Integer> myDeck;
    public MyStack() {
        myDeck = new ArrayDeque<>();
    }
    
    public void push(int x) {
        myDeck.offerLast(x);
    }
    
    public int pop() {
        Deque<Integer> myOutDeck = new ArrayDeque<>();
        int temp = 0;
        while(!myDeck.isEmpty()){
            if(myDeck.size()==1){
                temp = myDeck.pollFirst();
                break;
            }
            myOutDeck.offerLast(myDeck.pollFirst());
        }
        while(!myOutDeck.isEmpty()){
            myDeck.offerLast(myOutDeck.pollFirst());
        }


       return temp;
    }
    
    public int top() {
        Deque<Integer> myOutDeck = new ArrayDeque<>();
        int temp = 0;
        while(!myDeck.isEmpty()){
            if(myDeck.size()==1){
                temp = myDeck.peekFirst();
            }
            myOutDeck.offerLast(myDeck.pollFirst());
        }
        while(!myOutDeck.isEmpty()){
            myDeck.offerLast(myOutDeck.pollFirst());
        }
        return temp;
    }
    
    public boolean empty() {
        return myDeck.isEmpty();
    }
}


/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */