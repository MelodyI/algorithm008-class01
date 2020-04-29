# 多数元素
[LeetCode地址](https://leetcode-cn.com/problems/majority-element)
## 第一次
```java
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        int times = 0;
        for (int k : map.keySet())
            if (map.get(k) > times) times = map.get(k);
        for (int k :map.keySet())
            if (map.get(k) == times)
                return k;
        return 0;
    }
}
```
## 第二次
少了两个循环才少了5耗秒!
```java
class Solution {
    public int majorityElement(int[] nums) {
        int ans = 0, half = nums.length / 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int times = map.getOrDefault(nums[i], 0) + 1;
            if (times > half) {
                ans = nums[i];
                break;
            }
            map.put(nums[i], times);
        }
        return ans;
    }
}
```
