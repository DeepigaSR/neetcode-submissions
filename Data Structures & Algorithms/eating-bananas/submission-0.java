class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int maxRange = Integer.MIN_VALUE;
    for(int pile: piles){
        maxRange = Math.max(maxRange, pile);
    }
    int left=1,right=maxRange;
    while(left<=right){
        int mid = left+(right-left)/2;

        int hours=0;
        for(int pile :piles){
            hours+= Math.ceil((double) pile/mid);
        }
        if(hours<=h){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
    return left;
}
}