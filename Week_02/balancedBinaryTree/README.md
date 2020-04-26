# 平衡二叉树
[LeetCode地址](https://leetcode-cn.com/problems/balanced-binary-tree/)

## 代码
```java
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        boolean balance = Math.abs(height(root.left)-height(root.right)) < 2;
        return balance && isBalanced(root.left) && isBalanced(root.right);
    }

    private int height (TreeNode node) {
        if (node == null) return -1;
        return Math.max(height(node.left), height(node.right)) + 1;
    }
}
```
