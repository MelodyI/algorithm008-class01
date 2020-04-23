# 爬楼梯
[LeetCode地址](https://leetcode-cn.com/problems/climbing-stairs)

## 第一次
```java
//抄的
class Solution {
    public int climbStairs(int n) {
        if ( n < 3 ) {
            return n;
        }
        int f1 = 1, f2 = 2, f3 = 3;
        for(int i = 3; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
```
