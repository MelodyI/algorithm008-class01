# 在每个树行中找最大值
[LeetCode地址](https://leetcode-cn.com/problems/find-largest-value-in-each-tree-row/)
## 代码
```java
class Solution {

    List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> largestValues(TreeNode root) {
        _dfs(root, 0);
        return ans;
    }

    private void _dfs(TreeNode node, int level){
        // terminator
        if (node == null) return;
        // process current logic
        if (ans.size() <= level)
            ans.add(node.val);
        else
            ans.set(level, Math.max(node.val, ans.get(level)));
        // drill down
        _dfs(node.left, level + 1);
        _dfs(node.right, level + 1);
        // reverse state
    }

}
```
