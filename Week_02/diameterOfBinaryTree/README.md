# 二叉树的直径
[LeetCode地址](https://leetcode-cn.com/problems/diameter-of-binary-tree/)

## 抄答案
```java
class Solution {

    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    private int depth (TreeNode node) {
        if (node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        ans = Math.max(ans, left + right + 1);
        return Math.max(left, right) + 1;
    }
}
```
