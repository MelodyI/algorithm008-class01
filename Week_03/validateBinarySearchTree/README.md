# 验证二叉搜索树
[LeetCode地址](https://leetcode-cn.com/problems/validate-binary-search-tree)

## 二叉搜索树定义
1. 节点的左子树只包含小于当前节点的数。
2. 节点的右子树只包含大于当前节点的数。
3. 所有左子树和右子树自身必须也是二叉搜索树。

## 第一次
错了，输入`[10,5,15,null,null,6,20]`，结果`true`，预期`false`。
```java
class Solution {
    public boolean isValidBST(TreeNode root) {
        return _valid(root);
    }

    private boolean _valid(TreeNode node) {
        // terminator
        if (node == null) return true;
        // process current logic
        if (node.left != null && node.left.val >= node.val) return false;
        if (node.right != null && node.right.val <= node.val) return false;
        // drill down
        _valid(node.left);
        _valid(node.right);
        // restore current status
        return true;
    }
}
```
## 第二次
又错！输入`[10,5,15,null,null,6,20]`，结果`true`，预期`false`。没发现问题，看答案！
```java
class Solution {

    private boolean isValid;

    public boolean isValidBST(TreeNode root) {
        isValid = true;
        _valid(root);
        return isValid;
    }

    private void _valid(TreeNode node) {
        // terminator
        if (isValid == false || node == null) return;
        // process current logic
        if (node.left != null && node.left.val >= node.val) isValid = false;
        if (node.right != null && node.right.val <= node.val) isValid = false;
        // drill down
        _valid(node.left);
        _valid(node.right);
        // restore current status
    }
}
```

## 第三次
套路太深，代码也不容易理解，当特例背下来。
```java
class Solution {

    private boolean isValid;

    public boolean isValidBST(TreeNode root) {
        isValid = true;
        _valid(root, null, null);
        return isValid;
    }

    private void _valid(TreeNode node, Integer lower, Integer upper) {
        // terminator
        if (isValid == false || node == null) return;
        // process current logic
        int val = node.val;
        if (lower != null && val <= lower) isValid = false;
        if (upper != null && val >= upper) isValid = false;
        // drill down
        _valid(node.left, lower, val);
        _valid(node.right, val, upper);
        // restore current status
    }
}
```
