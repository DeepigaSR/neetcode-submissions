class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int maxCount =0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            int j=i,count=0;
            hs.clear();
            while(j<s.length() && hs.add(s.charAt(j))){
                j++;
                count++;
            }
            maxCount= Math.max(count,maxCount);
        }
        return maxCount;
    }
}
