class Solution {
// TC: O(n), SC: O(n)
    public String encode(List<String> strs) {

        char DELIMITER ='#';
        StringBuilder sb = new StringBuilder();
        for( String str: strs){
                sb.append(str.length());
                sb.append(DELIMITER);
                sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        char DELIMITER ='#';
        List<String> resList = new ArrayList();
        int i=0,j=0;
        while(i<str.length()){
            j=i;
            while(str.charAt(j) != DELIMITER)
            {
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            resList.add(str.substring(j+1,j+1+len));
            i = j+1+len;
        }
        return resList;

    //     OR
    //     char DELIMITER = '#';
    //     List<String> strList = new ArrayList();
    //     int i=0;
    //    while(i<s.length()){
    //             StringBuilder sb = new StringBuilder();
    //             while(s.charAt(i) != DELIMITER){
    //                 sb.append(s.charAt(i));
    //                 i++;
    //             }
    //             i++; // to move to the char next to delimiter
    //             int len = Integer.valueOf(sb.toString());
    //             int end = i+len;
    //             sb = new StringBuilder();
    //             while(i<end){
    //                  sb.append(s.charAt(i));
    //                  i++;
    //             }
    //             strList.add(sb.toString());       
    //     }
    //     return strList;
    }

}
