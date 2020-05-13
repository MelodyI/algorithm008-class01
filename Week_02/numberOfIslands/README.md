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

## 2020-05-13
第四周了，出现第二周的题目，竟然写出来了，不错。
```java
class Solution {

    private int r = 0;
    private int c = 0;

    public int numIslands(char[][] grid) {
        int ans = 0;
        if (grid.length == 0)
            return ans;
        r = grid.length;
        c = grid[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    ans += 1;
                    _clean(grid, i, j);
                }
            }
        }
        return ans;
    }

    private void _clean(char[][] grid, int row, int col) {
        // terminator
        if (row < 0 || row >= r || col < 0 || col >= c || grid[row][col] == '0')
            return;
        // process current login
        grid[row][col] = '0';
        // drill down
        _clean(grid, row + 1, col);
        _clean(grid, row - 1, col);
        _clean(grid, row, col + 1);
        _clean(grid, row, col - 1);
        // revert status
    }

}
```
