# 移动零-总结
挑了一个简单的题目做一下对比。
## 我的-抄官方的
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
```
第一次写算法，直接看了官方的解法。
## BruceLuo33
[地址](https://github.com/BruceLuo33/algorithm008-class01/tree/master/Week_01)
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroNums = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroNums  += 1;
            } else {
                nums[i - zeroNums] = nums[i];
            }
        }
        for (int i = nums.length - zeroNums; i < nums.length; i++) {
            nums [i] = 0;
        }
    }
}
```
比起官方解法，思路类似，没有官方的好。
## cbtpro
[地址](https://github.com/cbtpro/algorithm008-class01/tree/master/Week_01)
```javascript
var moveZeroes = function(nums) {
  let j = 0;
  for (let i = 0; i < nums.length; i++) {
    if (nums[i] !== 0) {
      let temp = nums[j];
      nums[j] = nums[i];
      nums[i] = temp;
      j++;
    }
  }
};
```
比起官方解法，直接替换，少了一次循环，一山还有一山高。
## MyHtime
[地址](https://github.com/MyHtime/algorithm008-class01/tree/master/Week_01)
```java
public class _283_move_zeroes {
    public void moveZeroes(int[] nums) {
        int length;
        if (nums == null || (length = nums.length) == 0) {
            return;
        }
        int slow = 0;
        for (int fast = 0; fast < length; fast++) {
            if (nums[fast] != 0) {
                if (fast != slow) {
                    nums[slow] = nums[fast];
                    nums[fast] = 0;
                }
                slow++;
            }
        }
    }
}
```
去掉不必要为空和长度的判断，增加判断slow==fast，减少不必要的替换，简直是完美。
## LiHuaNumber1
[地址](https://github.com/LiHuaNumber1/algorithm008-class01/tree/master/Week_01)
```java
public class N283MoveZeroes {
    public void moveZeroes(int[] nums) {
        boolean flag = false;
        int a = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                if (flag && i > a) {
                    nums[a] = nums[i];
                    nums[i] = 0;
                    a++;
                }
            } else if (!flag){
                flag = true;
                a = i;
            }
        }
    }
}
```
去掉flag以后，变成这样就好多了：
```java
class Solution {
    public void moveZeroes(int[] nums) {
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if ( i > a) {
                    nums[a] = nums[i];
                    nums[i] = 0;
                    a++;
                }
            }
        }
    }
}
```
## 总结
刚开始没思路，直接看官方解法，以为没有更好的，看了上面五位同学的解法，才知道一山还有一山高。
基础太差，主要是理解-看官方解法-实践-对比-总结，收获不小。