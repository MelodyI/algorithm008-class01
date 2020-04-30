# 跳跃游戏
[LeetCode地址](https://leetcode-cn.com/problems/jump-game)
## 代码
说实话，看似简单的题目，坑还挺深。
```java
class Solution {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, nums[i] + i);
                if ( max >= nums.length - 1)
                    break;
            }
        }
        return (max >= nums.length - 1)?true:false;
    }
}
```
