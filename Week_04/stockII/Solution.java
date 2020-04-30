class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, profit = 0, valley = 0, peek = 0;
        while (i < prices.length) {
            //
            while (i + 1 < prices.length && prices[i] >= prices[i+1])
                i++;
            valley = prices[i];
            //
            while (i + 1 < prices.length && prices[i] <= prices[i+1])
                i++;
            peek = prices[i];
            profit += peek - valley;
            i++;
        }
        return profit;
    }
}
