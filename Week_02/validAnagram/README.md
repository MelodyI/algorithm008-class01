# 有效的字母异位词
[地址](https://leetcode-cn.com/problems/valid-anagram/)

## 程序
数组的对比方法Arrays.equals()，之前没用过。
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length() )
            return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }
}
```
