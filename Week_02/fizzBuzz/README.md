# fizz-buzz
[LeetCode地址](https://leetcode-cn.com/problems/fizz-buzz)

## 程序
```java
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            if (i % 3 == 0) sb.append("Fizz");
            if (i % 5 == 0) sb.append("Buzz");
            if (sb.length() == 0) sb.append(String.valueOf(i));
            list.add(sb.toString());
        }
        return list;
    }
}
```
