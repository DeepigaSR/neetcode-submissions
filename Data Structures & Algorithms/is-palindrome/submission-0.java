class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
         {
            return true;
         }
        int slen= s.length();
         int i = 0;
         int j = slen-1;
         char Head;
         char Tail;
        while(i<j)
        {
             Head =  s.charAt(i);
             Tail = s.charAt(j);
             while(i<j && !Character.isLetterOrDigit(Head))
             {
                ++i;
                Head = s.charAt(i);
             }
            while(i<j &&!Character.isLetterOrDigit(Tail))
             {
                 --j;
                 Tail = s.charAt(j);
            }
            
                if(Character.toLowerCase(Head) != Character.toLowerCase(Tail))
    { return false;}           
    
             i++;
              j--;
           }
            

        return true;
 }
}