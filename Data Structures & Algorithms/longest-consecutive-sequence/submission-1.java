class Solution {
    public int longestConsecutive(int[] nums) {
        //TC: O(nlogn), SC: O(n or logn)
        // 2 3 4 4 5 10 20
        if(nums.length==0)
           return 0;
        
        Arrays.sort(nums);
        int count=1, maxCount=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1)
                {
                    count++;
                }else{
                    maxCount= Math.max(count,maxCount);
                    count=1;
                }
            }
        }
        return Math.max(count,maxCount);
    }
}
