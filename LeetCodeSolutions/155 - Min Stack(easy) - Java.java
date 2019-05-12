class MinStack {

    /** initialize your data structure here. */
    ArrayList<Integer> temp = new ArrayList<Integer>();
    public void push(int x) {
        temp.add(x);
        
    }
    
    public void pop() {
        temp.remove(temp.size() - 1);
    }
    
    public int top() {
        return temp.get(temp.size() - 1);
        
    }
    
    public int getMin() {
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < temp.size(); i++){
            int t = temp.get(i);
            if(t < minVal){
                minVal = t;
            }
        }
        return minVal;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */