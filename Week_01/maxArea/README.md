# 盛最多水的容器
[LeetCode地址](https://leetcode-cn.com/problems/container-with-most-water/)
## 代码
复习顺便把代码补上
```java
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while ( left < right ) {
            int minHeight = (height[left] < height[right])?height[left++]:height[right--];
            int currentArea = (right - left + 1) * minHeight;
            maxArea = (currentArea > maxArea)?currentArea:maxArea;
        }
        return maxArea;
    }
}
```
