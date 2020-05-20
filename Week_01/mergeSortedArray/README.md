# 合并两个有序数组
[LeetCode地址](https://leetcode-cn.com/problems/merge-sorted-array/)
## 代码
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
```
