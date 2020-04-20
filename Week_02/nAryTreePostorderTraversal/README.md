# N叉树的后序遍历
[LeetCode地址](https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal/)

## 递归方法
```java
public class Solution {

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(Node root, List<Integer> res) {
        if (root != null) {
            if (root.children != null)
                for (int i = 0; i < root.children.size(); i++)
                    helper(root.children.get(i), res);
            res.add(root.val);
        }
    }
}
```
迭代没看懂。。。
