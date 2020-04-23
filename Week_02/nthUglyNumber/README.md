# 丑数
[LeetCode地址](https://leetcode-cn.com/problems/chou-shu-lcof)

## 第一次
```java
//程序是不对的，看了官方解法，还没有看懂。
class Solution {
    public int nthUglyNumber(int n) {
        if ( n <= 0 || n > 1690 ) {
            throw new IllegalArgumentException("1 <= n <= 1690");
        }
        int[] nums = new int[n];
        for (int i = 1, j = 0; i < Integer.MAX_VALUE, j < n; i++) {
            if ( i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                nums[j++] = i;
            }
        }
        return nums[n - 1];
    }
}
```
## 第二次
```java
//早上起来又看了一遍，有点懂了，抄代码
class Solution {
    public int nthUglyNumber(int n) {
        if ( n <= 0 || n > 1690 ) {
            throw new IllegalArgumentException("1 <= n <= 1690");
        }
        int[] nums = new int[n];
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                nums[i] = 1;
                continue;
            }
            int n2 = nums[a] * 2, n3 = nums[b] * 3, n5 = nums[c] * 5;
            nums[i] = Math.min(Math.min(n2, n3), n5);
            if (nums[i] == n2) a++;
            if (nums[i] == n3) b++;
            if (nums[i] == n5) c++;
        }
        return nums[n - 1];
    }
}
```
|i|a|b|c|x1|x2|x3|x4|x5|x6|x7|x8|x9|x10|
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
|0|0-0|0-0|0-0|1|-|-|-|-|-|-|-|-|-|
|1|0-1|0-0|0-0|1|2|-|-|-|-|-|-|-|-|
|2|1-1|0-1|0-1|1|2|3|-|-|-|-|-|-|-|
|3|1-2|1-1|0-0|1|2|3|4|-|-|-|-|-|-|
|4|2-2|1-1|0-1|1|2|3|4|5|-|-|-|-|-|
|5|2-3|1-2|1-1|1|2|3|4|5|6|-|-|-|-|
|6|3-4|2-2|1-1|1|2|3|4|5|6|8|-|-|-|
|7|4-4|2-3|1-1|1|2|3|4|5|6|8|9|-|-|
|8|4-5|3-3|1-2|1|2|3|4|5|6|8|9|10|-|
|9|5-6|3-4|2-2|1|2|3|4|5|6|8|9|10|12|
