# 柠檬水找零
[LeetCode地址](https://leetcode-cn.com/problems/lemonade-change)
## 代码
贪心算法，一开始计算剩余金额，没卖货经验呐！
```java
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0, twenty = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5:
                    five += 1;
                    break;
                case 10:
                    if (five >= 1) five -= 1;
                    else return false;
                    ten +=1;
                    break;
                case 20:
                    if (five >= 1 && ten >= 1) {
                        five -= 1;
                        ten -= 1;
                    } else if (five >= 3) {
                        five -= 3;
                    } else {
                        return false;
                    }
            }
        }
        return true;
    }
}
```
