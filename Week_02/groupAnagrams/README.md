# 字母异位词分组
[LeetCode地址](https://leetcode-cn.com/problems/group-anagrams/)
## 代码
```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String anagram = String.valueOf(cs);
            if (!map.containsKey(anagram))
                map.put(anagram, new ArrayList<String>());
            map.get(anagram).add(str);
        }
        return new ArrayList(map.values());
    }
}
```
