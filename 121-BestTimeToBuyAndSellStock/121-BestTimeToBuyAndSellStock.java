// Last updated: 6/22/2025, 11:04:53 AM
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int minPrice = prices[0];  
        int maxProfit = 0;  
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
