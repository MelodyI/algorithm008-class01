# 搜索二维矩阵
[LeetCode地址](https://leetcode-cn.com/problems/search-a-2d-matrix)
## 第一遍
要考虑边界，刚开始没判断，结果没通过；再就是考虑进入行的判断，如果超出边界就直接下一行。
```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        for(int[] row : matrix) {
            int left = 0, right = row.length - 1;

            if (row[left] > target || target > row[right])
                continue;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (row[mid] == target) return true;
                if (target < row[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return false;
    }
}
```
