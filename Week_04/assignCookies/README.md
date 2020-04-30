# 分发饼干
[LeetCode地址](https://leetcode-cn.com/problems/assign-cookies)
## 第一次
其实是一个类似`N皇后`的问题
```java
class Solution {
    int ans = 0;
    int[] su;
    public int findContentChildren(int[] g, int[] s) {
        su = new int[s.length];
        Arrays.sort(g);
        Arrays.sort(s);
        _find(g, s, 0);
        return ans;
    }
    private void _find(int[] g, int[] s, int i){
        // terminator
        if (i == g.length) return;
        // process current logic
        for (int j = 0; j < s.length; j++) {
            if (su[j] == 1) continue;
            if (s[j] >= g[i]) {
                ans++;
                su[j] = 1;
                break;
            }
        }
        // drill down
        if (i + 1 < g.length) _find(g, s, i + 1);
    }
}
```
## 第二次
看了网上的解法，`N皇后`的速度`170ms`，这个只有`10ms`...
```java
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (g.length == 0 || s.length == 0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i])
                i++;
            j++;
        }
        return i;
    }
}
```
