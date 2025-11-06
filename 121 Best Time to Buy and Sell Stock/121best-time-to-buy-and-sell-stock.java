class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;       // index to buy
        int maxProfit = 0; // track max profit

        for (int sell = 1; sell < prices.length; sell++) {
            if (prices[sell] > prices[buy]) {
                // profit possible
                int profit = prices[sell] - prices[buy];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // found a cheaper buying price
                buy = sell;
            }
        }

        return maxProfit;
    }
}
