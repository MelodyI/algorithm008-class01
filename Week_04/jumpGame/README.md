# 跳跃游戏
[LeetCode地址](https://leetcode-cn.com/problems/jump-game)
## 代码
说实话，看似简单的题目，坑还挺深。思路明白，代码还不是特别懂，先抄下来。
```java
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, nums[i] + i);
                if ( max >= nums.length - 1)
                    return true;
            }
        }
        return false;
    }
}
```
