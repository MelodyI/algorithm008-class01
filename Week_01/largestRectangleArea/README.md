# 柱状图中最大的矩形
[LeetCode地址](https://leetcode-cn.com/problems/largest-rectangle-in-histogram/)
## 代码
```java
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int ans = 0;
        for (int i = 0; i < heights.length; i++) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i])
                ans = Math.max(ans, heights[stack.pop()] * (i - stack.peek() - 1));
            stack.push(i);
        }
        while (stack.peek() != -1)
            ans = Math.max(ans, heights[stack.pop()] * (heights.length - stack.peek() - 1));
        return ans;

    }
}
```
