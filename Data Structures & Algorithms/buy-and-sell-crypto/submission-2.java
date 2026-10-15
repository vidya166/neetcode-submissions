class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minbuy=prices[0];

        for(int sell:prices){
            maxp=Math.max(maxp,sell-minbuy);
            minbuy=Math.min(minbuy,sell);
        }
        return maxp;
    }
}
