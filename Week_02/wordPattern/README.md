# 单词规律
[LeetCode地址](https://leetcode-cn.com/problems/word-pattern)

## 第一次
一开始没看懂，不得不佩服。第一层：map的返回值；第二层：Objects.equals()
```java
class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        if (pattern.length() != word.length) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            Integer pi = map.put(pattern.charAt(i), i);
            Integer si = map.put(word[i], i);
            if (!Objects.equals(pi, si)) {
                return false;
            }
        }
        return true;
    }
}
```
