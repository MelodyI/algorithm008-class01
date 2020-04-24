# 分割平衡字符串
[LeetCode地址](https://leetcode-cn.com/problems/split-a-string-in-balanced-strings)

## 程序
```java
class Solution {
    public int balancedStringSplit(String s) {
        int res = 0, flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') flag++;
            else flag--;
            if (flag == 0) res++;
        }
        return res;
    }
}
```
