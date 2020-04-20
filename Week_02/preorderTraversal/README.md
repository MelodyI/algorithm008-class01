# 二叉树的前序遍历
[LeetCode地址](https://leetcode-cn.com/problems/binary-tree-preorder-traversal)

把中序遍历的代码copy过来，直接改：
```java
public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) helper(root.left, res);
            if (root.right != null) helper(root.right, res);
        }
    }
}
```
