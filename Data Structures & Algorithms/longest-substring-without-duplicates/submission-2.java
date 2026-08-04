class Solution {
    public int lengthOfLongestSubstring(String s) {

    // TC: O(n), SC: O(1)
    if(s.length()==0){
     return 0;
    }
    HashMap<Character,Integer> charToNextInd = new HashMap<>();
    int l =0, r = 0, maxLen=0;  // abba
    while(r<s.length()){
        char c = s.charAt(r); 
        if(charToNextInd.containsKey(c)){
            if(charToNextInd.get(c)>l)
               l=charToNextInd.get(c); 
        }
        charToNextInd.put(c,r+1);   
        maxLen = Math.max(maxLen,r-l+1);
        r++;
    }
    return maxLen;



        // Brute Force - TC:O(n2) SC: O(k)
        // if(s.length()==0){
        //     return 0;
        // }
        // int maxCount =0;
        // HashSet<Character> hs = new HashSet<>();
        // for(int i=0;i<s.length();i++){
        //     int j=i,count=0;
        //     hs.clear();
        //     while(j<s.length() && hs.add(s.charAt(j))){
        //         j++;
        //         count++; 
        //     }
        //     maxCount= Math.max(count,maxCount);// can use hs.size() instead of count
        // }
        // return maxCount;
    }
}
