# 有效的完全平方数
[LeetCode地址](https://leetcode-cn.com/problems/valid-perfect-square)
## 代码
这里要注意int和long的取值范围，如果`long x`改成`int x`就不对了。
```
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long x = num / 2;
        while (x * x > num)
            x = (x + num/x) / 2;
        return x * x == num;
    }
}
```
