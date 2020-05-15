# 二分查找模板
[模板地址](https://shimo.im/docs/hjQqRQkGgwd9g36J)
## 模板
```python
left, right = 0, len(array) - 1
while left <= right:
    mid = (left + rigth) / 2
    if array[mid] == target:
        # find the target
        break or return result
    elif array[mid] < target:
        left = mid + 1
    else:
        right = mid - 1
```
