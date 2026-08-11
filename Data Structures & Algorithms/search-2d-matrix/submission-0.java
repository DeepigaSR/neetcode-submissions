class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // TC: O(log r*c), SC: O(1)

        int r = matrix.length;
        int c= matrix[0].length;
        int left=0,right=r*c-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            int row = mid/c;
            int col= mid%c;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}
