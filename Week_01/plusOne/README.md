# 加一
[LeetCode](https://leetcode-cn.com/problems/plus-one/)
## 代码
```java
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i > -1; i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
```
