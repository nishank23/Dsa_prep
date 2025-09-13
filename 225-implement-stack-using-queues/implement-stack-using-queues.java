class MyStack {
    Deque<Integer> myDeck;
    public MyStack() {
        myDeck = new ArrayDeque<>();
    }
    
    public void push(int x) {
        myDeck.offerLast(x);
    }
    
    public int pop() {
       return myDeck.pollLast();
    }
    
    public int top() {
        return myDeck.peekLast();
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