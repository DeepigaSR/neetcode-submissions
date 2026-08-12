class Solution {
    public int search(int[] nums, int target) {
    //TC: O(logn), SC: O(1)

        int low = 0, high=nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target) return mid;

            if(nums[low]<=nums[mid]){// left array is in asc order
               if(nums[low]<= target && target <= nums[mid])
               {
                    high= mid-1;
               }else
               {
                    low = mid+1;
               }
            }else{
                if(nums[mid]<= target && target <= nums[high])
               {
                    low = mid+1;
               }else
               {
                    high= mid-1;
                    
               }
            }
        }
        return -1;    
    }
}
