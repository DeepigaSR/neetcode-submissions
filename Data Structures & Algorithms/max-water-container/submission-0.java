class Solution {
    public int maxArea(int[] heights) {

// TC: O(n), SC: O(1)
         int height =0, width =0, maxWater =0;
         int left = 0, right = heights.length-1;
         while(left<right){
             width = right - left;
             height = Math.min(heights[left], heights[right]);
             maxWater = Math.max(maxWater,height*width);
             if(heights[left]<heights[right]){
                left++;
             }else{
                right--;
             }
         }
         return maxWater;
    }
}
