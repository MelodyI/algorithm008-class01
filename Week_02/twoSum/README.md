# 两数之和
[LeetCode地址](https://leetcode-cn.com/problems/two-sum/)
## 方案A
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = target - nums[i] - nums[j];
                if (sum == 0){
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}
```
## 方案B
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            if (map.containsKey(expect)) {
                return new int[]{map.get(expect), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
```
