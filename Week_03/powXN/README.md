# Pow(x,n)
[LeetCode地址](https://leetcode-cn.com/problems/powx-n)
## 代码
今天看了覃老师的课程，重新写了一次程序，分治法！有一点理解了，先背下来。    
```java
class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        for (int i = n; i != 0; i /=2) {
            if (i % 2 == 1) ans *= x;
            x *= x;
        }
        return (n < 0) ? 1 / ans : ans;
    }
}
```
