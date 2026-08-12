class Solution {
    public int findMin(int[] nums) {
        //TC: O(logn), SC: O(1)
        if(nums.length==1) return nums[0];

        int low = 0, high=nums.length-1, mini= Integer.MAX_VALUE;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[low]<=nums[mid]){// left array is in asc odr low ind is the min
                mini = Math.min(mini,nums[low]);
                low=mid+1;
            }else{
                mini = Math.min(mini,nums[mid]);
                high=mid-1;
            }
        }
        return mini;
    }
}
