# 猜数字游戏
[LeetCode地址](https://leetcode-cn.com/problems/bulls-and-cows)

## 第一次（错误）
```java
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else if (secret.indexOf(String.valueOf(g)) >= 0) {
                cows++;
            }
        }
        return String.format("%dA%dB", bulls, cows);
    }
}
```
输入："1123" "0111"
输出："1A2B"
预期："1A1B"
要去重？
## 第二次（又错）
```java
class Solution {
    public String getHint(String secret, String guess) {
        int[] bucketBull = new int[10];
        int[] bucketCow = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                bucketBull[s - '0']++;
                bucketCow[g - '0']++;
            }
        }
        for (int i = 0; i < 10; i++)
            if (bucketBull[i] > 0 && bucketCow[i] > 0)
                cows++;

        return String.format("%dA%dB", bulls, cows);
    }    
}
```
输入："1122""2211"
输出："0A2B"
预期："0A4B"
不去重了？
## 第三次-对了
```java
class Solution {
    public String getHint(String secret, String guess) {
        int[] bucketBull = new int[10];
        int[] bucketCow = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                bucketBull[s - '0']++;
                bucketCow[g - '0']++;
            }
        }
        for (int i = 0; i < 10; i++)
            cows += Math.min(bucketBull[i], bucketCow[i]);

        return String.format("%dA%dB", bulls, cows);
    }
}
```
## 第四次
尝试用一个蓝子，没成功
