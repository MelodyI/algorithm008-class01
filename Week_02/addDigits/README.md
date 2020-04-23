# 各位相加
[LeetCode地址](https://leetcode-cn.com/problems/add-digits)

## 程序
天才，神奇的数学
```java
class Solution {
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
```
