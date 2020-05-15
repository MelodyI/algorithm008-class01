# 跳跃游戏 II
[LeetCode地址](https://leetcode-cn.com/problems/jump-game-ii)
## 代码
抄答案，这个只跳到了倒数第二个就算可以了，是不是有问题。
```java
class Solution {
    public int jump(int[] nums) {
        int end = 0, maxPositions = 0, steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPositions = Math.max(maxPositions, i + nums[i]);
            if (i == end) {
                end = maxPositions;
                steps++;
            }
        }
        return steps;
    }
}
```
