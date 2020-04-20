# 二叉树的中序遍历
[LeetCode](https://leetcode-cn.com/problems/binary-tree-inorder-traversal/)

输入条件[1,null,2,3]转换成代码：
```java
TreeNode root = new TreeNode(1);
root.right = new TreeNode(2);
root.right.left = new TreeNode(3);
```
程序抄的官方解法：
```java
public class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                helper(root.right, res);
            }
        }
    }
}
```
