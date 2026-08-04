class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        if(strs.length==0) return result;

        HashMap<String,List<String>> hm = new HashMap<>();
        for(String str: strs)
        {
            int[] count = new int[26];
            for(char c: str.toCharArray()){
                count[c-'a']++;
            }
            String key = Arrays.toString(count);
            if(!hm.containsKey(key))
            {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(str);
        
        }
        for(List<String> anaPair: hm.values()){
            result.add(anaPair);
        }
        return result;
        
    }
}
