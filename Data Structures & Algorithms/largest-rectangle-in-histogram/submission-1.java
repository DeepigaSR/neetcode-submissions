class Solution {
    public int largestRectangleArea(int[] heights) {
        // Brute Force: O(n2) SC: O(1) - TLE
//         int maxArea = Integer.MIN_VALUE;
//         for(int i=0;i<heights.length;i++){
//             int minHeight = heights[i];
//             for(int j=i;j<heights.length;j++){
//                 minHeight = Math.min(minHeight,heights[j]);
//                 int width= j-i+1;
//                 maxArea = Math.max(maxArea,minHeight*width);
//             }
//         }
//         return maxArea;
//     }
// }

    Stack<Integer> st = new Stack<Integer>();
    int maxArea =0;
    for(int i=0;i<heights.length;i++){
        while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
            int height = heights[st.peek()];
            st.pop();
            int pse = st.isEmpty() ? -1 :st.peek();
            int nse = i;
            int width = nse-pse-1;
            maxArea = Math.max(maxArea,width*height);
        }
        st.push(i);
    }

    while(!st.isEmpty()){
            int height = heights[st.peek()];
            st.pop();
            int pse = st.isEmpty() ? -1 :st.peek();
            int nse = heights.length;
            int width = nse-pse-1;
            maxArea = Math.max(maxArea,width*height);

    }
    return maxArea;

    }
}
