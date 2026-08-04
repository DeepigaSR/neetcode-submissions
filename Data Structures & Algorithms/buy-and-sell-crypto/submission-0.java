class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice = Integer.MAX_VALUE;
        for(int currPrice : prices){
            minPrice = Math.min(minPrice,currPrice);
            maxProfit = Math.max(maxProfit,currPrice - minPrice);
        }
        return maxProfit;
    }
}
