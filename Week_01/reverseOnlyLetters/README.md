# 仅仅反转字母
[LeetCode地址](https://leetcode-cn.com/problems/reverse-only-letters)

## 我的程序
程序是错的，还要考虑字母的顺序
```java
class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuffer sb = new StringBuffer();
        char[] arr = S.toCharArray();
        for (int i = 0; i < S.length() / 2; i++){
            char c = S.charAt(i);
            if ( ('a' <= c && 'z' >= c) || ('A' <= c && 'Z' >= c)){
                arr[i] = arr[S.length() - i - 1];
                arr[S.length() - i - 1] = c;
            }
        }
        return String.valueOf(arr);
    }
}
```
## 官方程序
用栈实现了后进先出，太巧秒了
```java
class Solution {
    public String reverseOnlyLetters(String S) {
        Stack<Character> letters = new Stack<>();
        for (char c: S.toCharArray())
            if (Character.isLetter(c))
                letters.push(c);
        StringBuilder ans = new StringBuilder();
        for (char c : S.toCharArray()){
            if (Character.isLetter(c))
                ans.append(letters.pop());
            else ans.append(c);
        }
        return ans.toString();
    }
}
```
