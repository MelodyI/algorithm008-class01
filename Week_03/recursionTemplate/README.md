# 递归代码模板

[地址](https://shimo.im/docs/DjqqGCT3xqDYwPyY/read)

## python
```python
def recursion(level, param1, param2, ...):
    # recursion terminator
    if level > MAX_LEVEL:
        process_result
        return
    # process logic in current level
    process(level, data...)
    # drill down
    self.recursion(level + 1, p1, ...)
    # reverse the current level status if needed
```
## java
```java
public void recur(int level, int param) {
    // terminator
    if (level > MAX_LEVEL) {
        // process result
        return;
    }
    // process current logic
    process(level, param);
    // drill down
    recur(level: level + 1, newParam);
    // restore current status
}
```
