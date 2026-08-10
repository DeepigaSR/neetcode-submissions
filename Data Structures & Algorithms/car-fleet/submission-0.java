class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // TC: O(nlogn), SC: O(n)
        // refer youtube video - algo Tamizha - https://www.youtube.com/watch?v=wUoNoM2U6nI
        int fleets = position.length;
        HashMap<Integer,Float> hm = new HashMap<>();
        for(int i=0;i<position.length;i++){
            float time =  (float)(target-position[i])/speed[i];
            hm.put(position[i], time);
        }
        Arrays.sort(position);
        int ind=position.length-1;
        while(ind>0){
            float c = hm.get(position[ind]);
            ind--;
            while(ind>=0 && c>=hm.get(position[ind])){
                fleets--;
                ind--;
            }
        }
        return fleets;
    }
}
