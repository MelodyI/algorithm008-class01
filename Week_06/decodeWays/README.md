# 解码方法
[LeetCode地址](https://leetcode-cn.com/problems/decode-ways)
## 代码
```java
public class Solution {
    public int numDecodings(String s) {
        char[] nums = s.toCharArray();
        int len = nums.length;
        int[] dp = new int[len + 1];
        dp[len] = 1;
        // 从右往左
        for (int i = len - 1; i >= 0; i--) {
            // 如果0则跳过
            if (nums[i] == '0')
                continue;
            int num = 0;
            // 最大值只2位
            for (int j = i; j < len && j - i < 2; j++) {
                // 乘10是进位
                num = num * 10 + (nums[j] - '0');
                if (num <= 26)
                    dp[i] += dp[j + 1];
            }
        }
        return dp[0];
    }
}
```
