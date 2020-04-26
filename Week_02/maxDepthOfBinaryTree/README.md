# 二叉树的最大深度
[LeetCode地址](https://leetcode-cn.com/problems/maximum-depth-of-binary-tree)

## 代码
```java
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
```
