# 动态规划定义
[参考地址](https://zh.wikipedia.org/wiki/动态规划)
## 定义
简称DP，是一种在数学、管理科学、计算机科学、经济学和生物信息学中使用的，通过把原问题分解为相对简单的子问题的方式求解复杂问题的方法。
## 适用
动态规划常常适用于有`重叠子问题`和`最优子结构性质`的问题，动态规划方法所耗时间往往远少于朴素解法。
1.最优子结构性质
2.无后效性
3.子问题重叠性质
## 思路
动态规划背后的基本思想非常简单。大致上，若要解一个给定问题，我们需要解其不同部分（即子问题），再根据子问题的解以得出原问题的解。
通常许多子问题非常相似，为此动态规划试图仅仅解决每个子问题一次，从而减少计算量：一量某个给定子问题的解已经算出，则将其记忆存储，以便下次需要同一个子问题之时直接查表。这种做法在重复子问题的数目关于输入的规模呈指数增长时特别有用。
## 实例
1. 背包问题
