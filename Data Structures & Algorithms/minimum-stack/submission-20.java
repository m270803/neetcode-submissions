class MinStack {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(s2.isEmpty() || s2.peek() >= val){
            s2.push(val);
        }
    }
    
    public void pop() {
        int value = s1.pop();
        if(!s2.isEmpty() && s2.peek() == value) s2.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        if(s2.isEmpty()){
            return s1.peek();
        }
        return s2.peek();
    }
}
