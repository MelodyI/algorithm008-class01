# 最小的k个数
[LeetCode地址](https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof)

## 程序
```java
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        for (int i=0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }
        return ans;
    }
}
```
## 总结
没有思路，直接看答案，跟难度没关系，主要是没见过，想不到。
