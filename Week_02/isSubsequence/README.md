# 判断子序列
[LeetCode地址](https://leetcode-cn.com/problems/is-subsequence/)

## 代码
```java
class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr = s.toCharArray();
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            j = t.indexOf(arr[i], j + 1);
            if (j == -1)
                return false;
        }
        return true;
    }
}
```
