# N叉树的前序遍历
[LeetCode地址](https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal)


```java
class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(Node root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.children != null)
                for (int i = 0; i < root.children.size(); i++)
                    helper(root.children.get(i), res);
        }
    }

}
```
