class Solution {
    public int trap(int[] height) {
        // Brute force: TC:O(3n), SC: O(2n)
        if(height.length<=2){
            return 0;
        }
        int len = height.length;
        int[] leftMaxArr = new int[len]; 
        int[] rightMaxArr = new int[len];
        int count = 0;
        leftMaxArr[0]=height[0];
        for(int i=1;i<len;i++){
            leftMaxArr[i]= Math.max(height[i],leftMaxArr[i-1]);
        }
        rightMaxArr[len-1]=height[len-1];
        for(int i=len-2;i>=0;i--){
            rightMaxArr[i]= Math.max(height[i],rightMaxArr[i+1]);
        }
         for(int i=1;i<len-1;i++){
            count += (Math.min(leftMaxArr[i],rightMaxArr[i]) - height[i]);
        }
        return count;
        
    }
}
