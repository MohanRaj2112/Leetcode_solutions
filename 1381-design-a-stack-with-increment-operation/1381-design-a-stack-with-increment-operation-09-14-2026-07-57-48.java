class CustomStack {

    int top;
    int[] stack;
    int maxSize;

    public CustomStack(int maxSize) {
        top = -1;
        this.maxSize = maxSize;
        stack = new int[maxSize];

        
    }
    
    public void push(int x) {
        if(top == maxSize-1){
            return;
        }
        stack[++top] = x;
        
    }
    
    public int pop() {
        if(top == -1){
            return -1;
        }
        return stack[top--];
        
    }
    
    public void increment(int k, int val) {
        if(maxSize < k){
            k = maxSize;
        }

        for(int i = 0; i < k; i++){
            stack[i]+= val;
        }
        
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */