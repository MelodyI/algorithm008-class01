# Pow(x, n)
[LeetCode地址](https://leetcode-cn.com/problems/powx-n)

## 快速幂算法（循环）
略过蛮力和快速幂算法（递归）两种方法，直奔主题
```java
class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * current_product;
            }
            current_product = current_product * current_product;
        }
        return ans;
    }
}
```
## 改进
```java
class Solution {
    public double myPow(double x, int n) {
        //增加了三个特殊情况
        if (x == 1) return x;
        if (x == -1) {
            if ( n % 2 == 0 ) return 1;
            else return -1;
        }
        if (n == 0) return 1;
        //加上原来的逻辑
    }
}

```
