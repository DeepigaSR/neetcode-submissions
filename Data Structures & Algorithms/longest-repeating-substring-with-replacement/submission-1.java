class Solution {
    public int characterReplacement(String s, int k) {
        // TC: O(n), SC:O(1)
        int l=0,r=0,len=s.length(),maxFreq=0,changes=0,maxLen=0;
        int[] freqArr = new int[26];
        while(r<len){
            freqArr[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq,freqArr[s.charAt(r)-'A']);
            changes = (r-l)+1 - maxFreq;
            if(changes>k){
                freqArr[s.charAt(l)-'A']--;
                l++;

            }else if(changes<=k){
                maxLen= Math.max(maxLen,r-l+1);
            }
            r++;
        }
        return maxLen;
    }
}

// Time: O(n) , Space: O(26)

// in any substring, we have to change the character length other than the maximum freq. eg. in a substring of AABA -> A's freq is 3 , B's freq is 1. Here, A has the maxFreq = 3 and so we have to change B. that can be formularized as -> characterstochange = totallength - maxFreq;

// update the frequency of each character in the array
// constantly check and update for maxFreq and changes required for that length.
// if changes < = k , then update that length. 
// Maintain the sliding window, do not shrink left when changes > k, shrink 1 left and increment 1 right thus maintaining the sliding window
// return the maximum length as result
// why are we not reducing maxFreq when changes>k, check the editorial slide 12. 
// Worth making a note here that maxFrequency doesn't tell us about the maximum frequency of a character in the current window. Rather, it tells us about the maximum frequency of a character seen until now.

// If you observe the maximum frequency in the current window, it is 2 (of A or B). Which actually makes the string invalid, because we can't convert all 5 characters into A or B with at most 2 replacements. But we previously seen a valid window of size 5. We don't want to decrease the size of the window. maxFrequency helps us achieve that.
