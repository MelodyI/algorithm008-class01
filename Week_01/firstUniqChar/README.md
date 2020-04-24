# 第一个只出现一次的字符
[LeetCode地址](https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof)

## 第一次
逻辑没问题，可LeetCode给了一个超长的字符串，应该是空间不够用
```java
class Solution {
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String r = s.replaceAll(String.valueOf(c), "");
            if (r.length() == s.length() - 1) return c;
        }
        return ' ';
    }
}
```
## 第二次
逻辑有问题，没有考虑字母出现的顺序
```java
class Solution {
    public char firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++)
            if (arr[i] == 1)
                return (char)(i + 'a');
        return ' ';
    }
}
```
## 第三次
通过了！
```java
class Solution {
    public char firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (arr[c - 'a'] == 1)
                return c;
        }
        return ' ';
    }
}
```
