class MyQueue {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public MyQueue() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        inStack.offerLast(x);
    }
    
    public int pop() {
      while(!inStack.isEmpty()){   
        outStack.offerLast(inStack.pollLast()); 
      }     
      int temp =  outStack.pollLast();
       while(!outStack.isEmpty()){
         inStack.offerLast(outStack.pollLast());
       }
       return temp; 
    }
    
    public int peek() {
    while(!inStack.isEmpty()){   
        outStack.offerLast(inStack.pollLast()); 
      }     
      int temp =  outStack.peekLast();
       while(!outStack.isEmpty()){
         inStack.offerLast(outStack.pollLast());
       }
       return temp; 
        
        
        
    }
    
    public boolean empty() {
        return inStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */