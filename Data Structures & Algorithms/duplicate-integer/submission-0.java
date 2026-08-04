class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Brute Force: O(n*n)
// Better : sort and compare first and next 
// Optimal: HashSet
// TC: O(n);  SC: O(N)
    HashSet<Integer> hs = new HashSet<>();
    for(int i : nums){
        if(hs.contains(i))
            return true;
        hs.add(i);
    }
    return false;
    }
}
