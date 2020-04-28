# 组合
[LeetCode地址](https://leetcode-cn.com/problems/combinations/)

## 代码
抄答案
```java
class Solution {

    List<List<Integer>> output = new LinkedList();
    int n;
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        _backtrack(1, new LinkedList<Integer>());
        return output;
    }

    private void _backtrack(int first, LinkedList<Integer> curr) {
        // if the combination is done
        if (curr.size() == k)
            output.add(new LinkedList(curr));

        for (int i = first; i < n + 1; ++i) {
            // add i into the current combination
            curr.add(i);
            // use next integers to complete the combination
            _backtrack(i + 1, curr);
            // backtrack
            curr.removeLast();
        }
    }
}
```
