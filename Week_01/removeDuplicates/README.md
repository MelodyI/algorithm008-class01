# 删除排序数组中的重复项
[LeetCode地址](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array)

## 程序
```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
               nums[++slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
```
