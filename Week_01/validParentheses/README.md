# 有效的括号
[LeetCode地址](https://leetcode-cn.com/problems/valid-parentheses/)
## 代码
```java
class Solution {

    private HashMap<Character, Character> mappings;

    public Solution() {
        mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsKey(c)) {
                char e = stack.isEmpty()?'#':stack.pop();
                if (e != mappings.get(c)) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
```
