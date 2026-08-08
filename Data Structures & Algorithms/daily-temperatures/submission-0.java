class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
// Clarifying questions:
// Are we looking for the first future day that has a strictly higher temperature?”
// “If there is no warmer future day, should the answer be 0?”
//“What are the constraints on n?” 

int[] ans = new int[temperatures.length];
Stack<Integer> st = new Stack<>();
for(int currInd=0;currInd<temperatures.length;currInd++){
    int currTemp = temperatures[currInd];
    while(!st.isEmpty() && currTemp>temperatures[st.peek()]){
        int prevTempInd= st.pop();
        ans[prevTempInd] = currInd - prevTempInd;
    }
    st.push(currInd);
}
return ans;
    }
}
