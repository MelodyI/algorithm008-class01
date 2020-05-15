# 模拟行走机器人
[LeetCode地址](https://leetcode-cn.com/problems/walking-robot-simulation)
## 代码
重点：方向的计算、编码、最大值。
```java
class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};
        int x = 0, y = 0, di = 0;

        Set<Long> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles)
            obstacleSet.add(_code(obstacle[0], obstacle[1]));

        int ans = 0;
        for (int cmd : commands) {
            if (cmd == -2) {
                di = (di + 3) % 4;
                continue;
            }
            if (cmd == -1) {
                di = (di + 1) % 4;
                continue;
            }
            for (int k = 0; k < cmd; k++) {
                int nx = x + dx[di];
                int ny = y + dy[di];
                long code = _code(nx, ny);
                if (obstacleSet.contains(code)) break;
                x = nx;
                y = ny;
                ans = Math.max(ans, x * x + y * y);
            }
        }
        return ans;
    }

    private long _code(int x, int y) {
        long ox = (long)x + 30000;
        long oy = (long)y + 30000;
        return (ox << 16) + oy;
    }

}

```
