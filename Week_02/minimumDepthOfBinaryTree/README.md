# 二叉树的最小深度
[LeetCode地址](https://leetcode-cn.com/problems/minimum-depth-of-binary-tree)

## 代码
比最大深度难理解一些
```java
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        int min_depth = Integer.MAX_VALUE;
        if (root.left != null)
            min_depth = Math.min(minDepth(root.left), min_depth);
        if (root.right != null)
            min_depth = Math.min(minDepth(root.right), min_depth);
        return min_depth + 1;
    }
}
```
## 第二次
日期：2020-04-28，上一次的代码是抄的，竟然不会，又看了一遍。
