class Solution {
    public int[] topKFrequent(int[] nums, int k) {
//TC: O(N); SC: O(N)
        if(nums.length==k) return nums;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num: nums)
        {
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        for(int freqValue : hm.values())
        {
            if(freqValue>maxFreq){
                maxFreq= freqValue;
            }
        }
        List<Integer>[] buckets = new List[maxFreq+1];
        for(int i=0;i<=maxFreq;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int num: hm.keySet()){
            int freq = hm.get(num);
            buckets[freq].add(num);
        }

        int counter=0;
        int[] res = new int[k];
        for(int i=maxFreq;i>=0&&counter<k;i--){
             if(buckets[i]!=null){
                for(int num: buckets[i]){
                    if(counter<k){
                        res[counter++] = num;
                    }
                }
             }
        }
        return res;

    }
}
