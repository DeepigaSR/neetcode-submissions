// class MinStack {
//     //TC: O(1), SC: O(2n)
//     Stack<int[]> st = new Stack<>();
//     public MinStack() {
        
//     }
    
//     public void push(int val) {
//         if(st.isEmpty()){
//             st.push(new int[]{val,val});
//         }else{
//             int curMin = st.peek()[1];
//             st.push(new int[]{val,Math.min(curMin,val)});   
//         }  
        
//     }
    
//     public void pop() {
//         st.pop();
        
//     }
    
//     public int top() {

//         return st.peek()[0];
        
//     }
    
//     public int getMin() {
//         return st.peek()[1];
        
//     }
// }

// Optimal Solution : Two stack TC:O(1), SC: O(n) in best case

class MinStack{

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack(){

    }

    public void push(int val){
        if(minSt.isEmpty() || val<= minSt.peek()){ 
            // very imp : above should always use <= rather than < in handling duplicates
            minSt.push(val);
        }
        st.push(val);

    }

    public void pop(){
        if(st.peek().equals(minSt.peek())){
            minSt.pop();
        }
        st.pop();   
    }

    public int top(){
        return st.peek();

    }

    public int getMin(){
        return minSt.peek();

    }
}


