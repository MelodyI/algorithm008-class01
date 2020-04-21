# N叉树的层序遍历
[LeetCode地址](https://leetcode-cn.com/problems/n-ary-tree-level-order-traversal/)

## 递归方法
```java
class Solution {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root != null) traverseNode(root, 0);
        return result;
    }

    private void traverseNode(Node node, int level) {
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        for (Node child : node.children) {
            traverseNode(child, level + 1);
        }
    }
}
```

### 心得
1.很巧妙的用了列表size与树level做为比较。<br>
2.对于null的理解如下：
```java
[1,null,3,2,4,null,5,6,7,null,8,null,9,10,null,11]
```

<table>
    <tr>
        <th>level</th>
        <th colspan="9">node</th>
    </tr>
    <tr>
        <td>0</td>
        <td colspan="9">1</td>
    </tr>
    <tr>
        <td>1</td>
        <td colspan="3">3</td>
        <td colspan="3">2</td>
        <td colspan="3">4</td>
    </tr>
    <tr>
        <td>2</td>
        <td>5</td>
        <td>6</td>
        <td>7</td>
        <td>8</td>
        <td>--</td>
        <td>--</td>
        <td>9</td>
        <td>10</td>
        <td>--</td>
    </tr>
    <tr>
        <td>3</td>
        <td>11</td>
        <td>--</td>
        <td>--</td>
        <td>--</td>
        <td>--</td>
        <td>--</td>
        <td>--</td>
        <td>--</td>
        <td>--</td>
    </tr>
</table>
