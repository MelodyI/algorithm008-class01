# 位1的个数
[LeetCode地址](https://leetcode-cn.com/problems/number-of-1-bits)
## 代码
直接抄了答案，这两周实在是没时间
```java
public class Solution {
    public int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }
}
```
