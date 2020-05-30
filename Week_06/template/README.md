# 模板
## 递归代码模板
[参考地址](https://shimo.im/docs/EICAr9lRPUIPHxsH/read)
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
    recur(level + 1, newParam);
    // restore current status
}
```
## 分治代码模板
[参考地址](https://shimo.im/docs/zvlDqLLMFvcAF79A)
```python
def divide_conquer(problem, param1, param2, ...):
    # recursion terminator
    if problem is None:
        print_result
        return

    # prepare data
    data = prepare_data(problem)
    subproblems = split_problem(problem, data)

    # conquer subproblems
    subresult1 = self.divide_conquer(subproblems[0], p1, ...)
    subresult2 = self.divide_conquer(subproblems[1], p1, ...)
    subresult3 = self.divide_conquer(subproblems[2], p1, ...)

    # process and generate the final result
    result = process_result(subresult1, subresult2, subresult3, ...)

    # revert the current level states
```
## 动态规划定义
[参考地址](https://en.wikipedia.org/wiki/Dynamic_programming)
用递推的方式，将复杂问题分解成简单子问题
Divide & Conquer + Optimal substructure(分治+最优子结构)

关键点：
动态规划和递归或者分治，没有根本上的区别（关键看有无最优的子结构）
共性：找到重复子问题
差异性：最优子结构、中途可以淘汰次优解
