# 零钱兑换
[LeetCode地址](https://leetcode-cn.com/problems/coin-change/)
## 第一次
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
## 第二次
动态规划-更适合实际场景，目前还没有完全理解。
```java
class Solution {

    public int coinChange(int[] coins, int amount) {
        if (amount < 1) return 0;
        return _coinChange(coins, amount, new int[amount]);
    }

    private int _coinChange(int[] coins, int rem, int[] count) {
        /* terminator */
        if (rem < 0) return -1;
        if (rem == 0) return 0;
        // 找到答案
        if (count[rem - 1] != 0) return count[rem - 1];
        /* process current logic */
        /* drill down */
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = _coinChange(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        /* reverse current state */
        count[rem - 1] = (min == Integer.MAX_VALUE)?-1:min;
        return count[rem - 1];
    }
}

```
