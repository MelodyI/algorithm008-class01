# 零钱兑换
[LeetCode地址](https://leetcode-cn.com/problems/coin-change/)
## 代码
解法是错的，题目不能用贪心算法。输入`[186,419,83,408]`和`6249`，输出`-1`，预期`20`。
```java
class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans = 0;
        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0 && amount > 0; i--) {
            if (amount < coins[i]) continue;
            ans += amount / coins[i];
            amount %= coins[i];
        }
        return (amount == 0)? ans:-1;
    }
}
```
