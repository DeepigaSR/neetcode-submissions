class Solution {
    public boolean isAnagram(String s, String t) {
// TC: O(s.len), SC: O(1)
        if(s.length() != t.length()) return false;
        int[] alphabetEquivNumArr = new int[26];
        for(int i=0;i<s.length();i++){
            alphabetEquivNumArr[s.charAt(i)-'a']++;
            alphabetEquivNumArr[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(alphabetEquivNumArr[i]!=0)
              return false;
        }
        return true;
    }
}
