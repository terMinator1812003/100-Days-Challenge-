public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;
        int cost;
        for (int i = 1; i < prices.length; i++) {
            cost = prices[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return profit;
    }
}
