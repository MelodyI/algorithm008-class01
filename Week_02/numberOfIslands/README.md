# 岛屿数量
[LeetCode地址](https://leetcode-cn.com/problems/number-of-islands/)

## 代码
```java
class Solution {
    private int result = 0;
    private int m;
    private int n;

    public int numIslands(char[][] grid) {
        //
        if (grid.length == 0 || grid[0].length == 0)
            return result;
        //
        m = grid.length;
        n = grid[0].length;
        //
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '0')
                    continue;
                dfs(grid, i, j);
                result++;
            }
        }
        return result;
    }

    private void dfs (char[][] grid, int i, int j) {
        //
        if (i < 0 || j < 0 || i >= m || j >= n)
            return;
        //
        if (grid[i][j] == '0')
            return;
        //
        grid[i][j] = '0';
        //
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
```

## 小结
一开始没弄清楚题目，直接看解法，连续看了两遍才明白。
