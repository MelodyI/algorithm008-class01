# 最小基因变化
[LeetCode地址](https://leetcode-cn.com/problems/minimum-genetic-mutation)
## 代码
这个是抄的答案，为什么不直接计算不同字符的个数呢？
```java
class Solution {

    int minStepCount = Integer.MAX_VALUE;

    public int minMutation(String start, String end, String[] bank) {
        _dfs(new HashSet<String>(), 0, start, end, bank);
        return (minStepCount == Integer.MAX_VALUE)?-1:minStepCount;
    }

    private void _dfs(HashSet<String> step, int stepCount, String current, String end, String[] bank) {
        if (current.equals(end))
            minStepCount = Math.min(stepCount, minStepCount);

        for (String str : bank) {
            int diff = 0;
            for (int i = 0; i < str.length(); i++)
                if (current.charAt(i) != str.charAt(i))
                    if (++diff > 1)
                        break;
            if (diff == 1 && !step.contains(str)) {
                step.add(str);
                _dfs(step, stepCount + 1, str, end, bank);
                step.remove(str);
            }
        }
    }
}

```
