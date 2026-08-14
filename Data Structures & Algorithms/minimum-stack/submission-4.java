class MinStack {

    private Stack<Integer> minS;
    Stack<Integer> newStack = new Stack<>();

    public MinStack() {
        this.minS = new Stack<>();
    }
    
    public void push(int val) {
        minS.push(val);
        if(newStack.empty() || minS.peek() <= newStack.peek()) newStack.push(minS.peek());
    
    }
    
    public void pop() {
        
        if(!newStack.empty() && minS.peek() == newStack.peek())
        {
            newStack.pop();
            minS.pop();
        }
        else{
            minS.pop();
        }
        


    }
    
    public int top() {
        return minS.peek();
    }
    
    public int getMin() {
        if(!newStack.empty())
        {
            return newStack.peek();

        }
        return -1;
    }
}
