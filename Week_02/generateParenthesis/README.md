# 括号生成
[LeetCode地址](https://leetcode-cn.com/problems/generate-parentheses)

## 第一次
暴力法、回溯法（卡特兰数）、递归，三个解法一个也没看懂！头痛呀！

## 第二次
今天课程上讲了，好像瞬间懂了
```java
class Solution {

    private List<String> list;

    public List<String> generateParenthesis(int n) {
        list = new ArrayList<>();
        _generate(0, 0, n, "");
        return list;
    }

    private void _generate(int left, int right, int n, String s) {
        // terminator
        if (left == n && right == n) {
            list.add(s);
            return;
        }
        // process current logic
        // drill down
        if (left < n) _generate(left + 1, right, n, s + "(");
        if (right < left) _generate(left, right + 1, n, s + ")");
        // reverse states
    }
}
```
