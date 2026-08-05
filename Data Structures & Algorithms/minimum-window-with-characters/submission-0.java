class Solution {
    public String minWindow(String s, String t) {
        
        int slen=s.length(), tlen=t.length(),l=0,r=0,count=0,sInd=-1,minValue= Integer.MAX_VALUE;
        if(tlen>slen) return "";

        int[] hashArr = new int[256];

        for(int i=0;i<tlen;i++){
            hashArr[t.charAt(i)]++;
        }
        while(r<slen){
            if(hashArr[s.charAt(r)]>0) // already present in string t
            {
                count++;
            }
            hashArr[s.charAt(r)]--;
            while(count == tlen){

                if((r-l+1)<minValue)
                {
                    minValue = r-l+1;
                    sInd = l;
                }
                hashArr[s.charAt(l)]++;
                if(hashArr[s.charAt(l)] >0)
                {
                    count= count-1;
                }
                l++;
            }
            r++;
        }
        return sInd==-1 ? "" : s.substring(sInd,sInd+minValue);

    }
}
