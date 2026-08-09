class MinStack {
    //TC: O(1), SC: O(2n)

    Stack<int[]> st = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new int[]{val,val});
        }else{
            int curMin = st.peek()[1];
            st.push(new int[]{val,Math.min(curMin,val)});   
        }  
        
    }
    
    public void pop() {
        st.pop();
        
    }
    
    public int top() {

        return st.peek()[0];
        
    }
    
    public int getMin() {
        return st.peek()[1];
        
    }
}
