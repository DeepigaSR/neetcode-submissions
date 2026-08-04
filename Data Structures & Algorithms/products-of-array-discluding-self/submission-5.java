class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int len = nums.length;
        int[] resultArr = new int[len];
        resultArr[0] = 1;
        for(int i=1;i<len;i++){
            resultArr[i] = resultArr[i-1]*nums[i-1];
        }

        int right = 1; // right for the first iteration
        for(int i=len-1;i>=0;i--){
            resultArr[i] = resultArr[i]*right;
            right  = right*nums[i]; // right for the next iteration

        }
        return resultArr;

        // TC: O(n), SC: O(n)
        // int len = nums.length;
        // int[] leftArr = new int[len];
        // int[] rightArr = new int[len];
        // // int[] resultArr = new int[len];
        // leftArr[0] = 1;
        // for(int i=1;i<len;i++){
        //     leftArr[i] = leftArr[i-1]*nums[i-1];
        // }

        // rightArr[len-1] = 1;
        // for(int i=len-2;i>=0;i--){
        //     rightArr[i] = rightArr[i+1]*nums[i+1];
        //     // keep updating the leftArr with result
        //     leftArr[i] = leftArr[i]*rightArr[i];

        // }
        // // rightArr[len-1] = 1;
        // // for(int i=len-2;i>=0;i--){
        // //     rightArr[i] = rightArr[i+1]*nums[i+1];
        // // }
        // // for(int i=0;i<len;i++){
        // //     resultArr[i] = leftArr[i]*rightArr[i];
        // // }
        // // the above commented part or the below 
        // return leftArr;
   }  
}