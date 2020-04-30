# 买卖股票的最佳时机II
[LeetCode地址](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii)
## 代码
快慢指针的思路
```java
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
```
