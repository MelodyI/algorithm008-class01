# 两个数组的交集II
[LeetCode](https://leetcode-cn.com/problems/intersection-of-two-arrays-ii)

## 程序
抄的答案
```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //
        if (nums1.size() > nums2.size())
            return intersect(nums2, nums1);
        //
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums1)
            map.put(n, map.getOrDefault(n, 0) + 1);
        //
        int k = 0;
        for (int n : nums2) {
            int cnt = map.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                map.put(n ,cnt - 1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}

```
