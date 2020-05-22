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
## 第二次
日期：2020-04-28，上一次的代码是抄的，刚才做了一次，竟然不会，又看了一遍。
## 第三次
日期：2020-05-22
```
class Solution {

    private int ans = 0;

    public int maxDepth(TreeNode root) {
        _seek(root, 0);
        return ans;
    }

    private void _seek(TreeNode node, int level) {
        // terminator
        if (node == null) return;
        // process current logic
        ans = Math.max(ans, level + 1);
        // drill down
        _seek(node.left, level + 1);
        // reverse state
        _seek(node.right, level + 1);
    }
}
```
