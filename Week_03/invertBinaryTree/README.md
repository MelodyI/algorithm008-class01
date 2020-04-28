# 翻转二叉树

[LeetCode地址](https://leetcode-cn.com/problems/invert-binary-tree)

## 第一次
错了，没有考虑子节点是null的情况。输入`[1,2]`，输出`[1,2]`，预期结果`[1,null,2]`。不过老师的递归代码模板是厉害，昨天还没有思路，今天竟然会了。

```java
class Solution {
    public TreeNode invertTree(TreeNode root) {
        _invert(root);
        return root;
    }

    private void _invert(TreeNode node) {
        // ternimator
        if (node == null) return;
        // process current logic
        if (node.left != null && node.right != null) {
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        // drill down
        if (node.left != null) _invert(node.left);
        if (node.right != null) _invert(node.right);
        // restore current status
    }
}
```
## 第二次
```java
// 将
if (node.left != null && node.right != null)
// 换成
if (node.left != null || node.right != null)
```
