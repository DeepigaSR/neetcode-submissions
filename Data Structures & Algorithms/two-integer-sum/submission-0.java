class Solution {
    public int[] twoSum(int[] nums, int target) {
// TC: O(n), SC:O(n)
        HashMap<Integer,Integer> hashTabl = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int subValue = target - nums[i];
            if(hashTabl.containsKey(subValue))
            {
                return new int[]{hashTabl.get(subValue),i};
            }
            hashTabl.put(nums[i],i);
        }
        return new int[]{};
    }
}
