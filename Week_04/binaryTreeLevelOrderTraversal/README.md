# 二叉树的层序遍历
[LeetCode地址](https://leetcode-cn.com/problems/binary-tree-level-order-traversal)
## 代码
按照覃老师的方法，竟然写对了！
```java
class Solution {

    private List<List<Integer>> ans;

    public List<List<Integer>> levelOrder(TreeNode root) {
        ans = new ArrayList<>();
        _dsf(root, 0);
        return ans;
    }

    private void _dsf(TreeNode node, int level) {
        // terminator
        if (node == null) return;
        // process current logic
        if (level > ans.size() - 1)
            ans.add(new ArrayList<Integer>());
        ans.get(level).add(node.val);            
        // drill down
        _dsf(node.left, level + 1);
        _dsf(node.right, level + 1);
        // reverse state
    }
}
```
