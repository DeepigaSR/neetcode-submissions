class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
// Clarifying questions:
// Are we looking for the first future day that has a strictly higher temperature?”
// “If there is no warmer future day, should the answer be 0?”
//“What are the constraints on n?” 

// Pattern: if find next greater element (NGE) - use stack or deque - remember - if found the (NGE) - pop - stack will be in the decreasing order (top will have small value)
// Better Complexity: TC: O(2n), SC:O(n)
    // int[] ans = new int[temperatures.length];
    // Stack<Integer> st = new Stack<>();
    // for(int currInd=0;currInd<temperatures.length;currInd++){
    //     int currTemp = temperatures[currInd];
    //     while(!st.isEmpty() && currTemp>temperatures[st.peek()]){
    //         int prevTempInd= st.pop();
    //         ans[prevTempInd] = currInd - prevTempInd;
    //     }
    //     st.push(currInd);
    // }
    // return ans;

// Optimal: 
int len = temperatures.length;
    int[] ans = new int[temperatures.length];
        
    int hottestTemp =temperatures[len-1];
    int days=0;

    for(int currInd=len-2;currInd>=0;currInd--)
    {
        if(temperatures[currInd]>=hottestTemp)
        {
            hottestTemp = temperatures[currInd];
            continue;// this is the hottest temp so far, so cant have a nge , continue
        }

        days=1;
        while(temperatures[currInd+days]<=temperatures[currInd])
        {
            days += ans[currInd+days];
        }
        ans[currInd] = days;
    
    }
    return ans;
  }
}
// int n = temperatures.length;
//         int[] res = new int[n];
//         int hottest = temperatures[n-1];
//         int days= 0;
//         for(int i= n-2;i>=0;i--)
//         {
//             if(temperatures[i]>=hottest)
//             {
//                 hottest = temperatures[i];
//                 continue; // from right if this is the hottest day found so far, so there cannot be a greater temp day on the right , so continue.. res[i] will be zero
//             }

//             days =1;
//             while(temperatures[i+days]<=temperatures[i]) // there is a hotter da
//             {
//                 days += res[i+days];
//             }
//             res[i] = days;
//         }
//         return res;
//     }
// }