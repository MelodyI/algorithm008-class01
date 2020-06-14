# 2的幂
[LeetCode地址](https://leetcode-cn.com/problems/power-of-two/)
## 代码
直接抄了答案，这两周实在是没时间
```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        while (n % 2 == 0) n /= 2;
        return n == 1;
    }
}
```
