class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] leftArr = new int[len];
        int[] rightArr = new int[len];
        int[] resultArr = new int[len];
        leftArr[0] = 1;
        for(int i=1;i<len;i++){
            leftArr[i] = leftArr[i-1]*nums[i-1];
        }

        // rightArr[len-1] = 1;
        // for(int i=len-2;i>=0;i--){
        //     rightArr[i] = rightArr[i+1]*nums[i+1];
        // }
        // for(int i=0;i<len;i++){
        //     resultArr[i] = leftArr[i]*rightArr[i];
        // }

        int right = 1;
        for(int i=len-2;i>=0;i--){
            rightArr[i] = right*nums[i+1];
            right = rightArr[i];
            leftArr[i] = leftArr[i]*rightArr[i];

        }
       

        return leftArr;
}  
}