# 分割平衡字符串
[LeetCode地址](https://leetcode-cn.com/problems/split-a-string-in-balanced-strings)
## 描述
在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。
给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
返回可以通过分割得到的平衡字符串的最大数量。
### 示例 1
```
输入：s = "RLRRLLRLRL"
输出：4
解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
```
### 示例 2
```
输入：s = "RLLLLRRRLR"
输出：3
解释：s 可以分割为 "RL", "LLLRRR", "LR", 每个子字符串中都包含相同数量的 'L' 和 'R'。
```
### 示例 3
```
输入：s = "LLLLRRRR"
输出：1
解释：s 只能保持原样 "LLLLRRRR".
```
### 提示：
```
1. 1 <= s.length <= 1000
2. s[i] = 'L' 或 'R'
3. 分割得到的每个字符串都必须是平衡字符串。
```
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
