class Solution {
    public boolean checkInclusion(String s1, String s2) {
    
  int s1Len = s1.length();
        int s2Len = s2.length();
        if(s1Len>s2Len){
            return false;
        }
        int[] s1Arr = new int[26];
        int[] s2Arr = new int[26];
        for(int i=0;i<s1Len;i++){
            s1Arr[s1.charAt(i)-'a']++;
            s2Arr[s2.charAt(i)-'a']++;
        }
        if(matches(s1Arr,s2Arr))
           return true;
        
        for(int j=s1Len;j<s2.length();j++){
            s2Arr[s2.charAt(j)-'a']++;
            s2Arr[s2.charAt(j-s1Len)-'a']--;
            if(matches(s1Arr,s2Arr))
               return true;
        }
        return false;

    }

    private boolean matches(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
}