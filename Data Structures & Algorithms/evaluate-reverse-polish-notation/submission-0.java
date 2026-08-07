class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        for(String token: tokens){
            if(!("+-*/").contains(token)){
                deque.offer(Integer.valueOf(token));
                continue;
            }else{
                int n2=deque.removeLast();
                int n1=deque.removeLast();
                switch(token)
                {
                    case "+":
                        deque.offer(n1+n2);
                        break;

                    case "-":
                        deque.offer(n1-n2);
                        break;

                    case "*":
                        deque.offer(n1*n2);
                        break;

                    case "/":
                        deque.offer(n1/n2);
                        break;
                }
            }
        }
        return deque.removeLast(); //deque.poll();
     }
}
