class DoubleNode {
    String val;
    DoubleNode prev;
    DoubleNode next;

    public DoubleNode(String val){
        this.val = val;
    }
    public DoubleNode(String val,DoubleNode prev,DoubleNode next){
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}

class BrowserHistory {
    DoubleNode currentPage;
    

    public BrowserHistory(String homepage) {
        currentPage = new DoubleNode(homepage);
    }
    
    public void visit(String url) {
        DoubleNode newPage = new DoubleNode(url);
        newPage.prev = currentPage;
        currentPage.next = newPage;
        currentPage = currentPage.next;
    }
    
    public String back(int steps) {
        // if i am going back more then steps then x history then i need to return the
        //element which has prev as null 

        while(currentPage.prev!=null && steps>0){
            
            currentPage = currentPage.prev;
            steps--;
        }
        return currentPage.val;
    }
    
    public String forward(int steps) {
        while(currentPage.next!=null && steps>0){
            
            currentPage = currentPage.next;
            steps--;
        }
        return currentPage.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */