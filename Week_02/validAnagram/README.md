# 有效的字母异位词
[地址](https://leetcode-cn.com/problems/valid-anagram/)
## 程序
数组的对比方法Arrays.equals()，之前没用过。
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if ( s.length() != t.length() )
            return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return Arrays.equals(s1, t1);
    }
}
```
## yyr0717
[代码地址](https://github.com/yyr0717/algorithm008-class01/blob/master/Week_02/242_leetcode_valid-anagram.java)
目前看到最好的，思路、时间复杂度、边界条件
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] counter = new int[26];
        for(int i = 0; i < s.length(); i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int count : counter){
            if(count != 0)
                return false;
        }
        return true;
    }
}
```
## xzuopydev
[代码地址](https://github.com/xzuopydev/algorithm008-class01/blob/master/Week_02/%5B242%5D有效的字母异位词.java)
```java
public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            a[t.charAt(i) - 'a']--;
        }
        for (int tmp : a) {
            if (tmp != 0) {
                return false;
            }
        }
        return true;
    }
}
```
## MyHtime
[代码地址](https://github.com/MyHtime/algorithm008-class01/blob/master/Week_02/_242_is_anagram.java)
### 方法A
```java
// 1:T:O(NlogN) S:O(N)
public boolean isAnagram_1(String s, String t) {
    if (s.length() != t.length() ) {
        return false;
    }
    char[] charS = s.toCharArray();// S-O(N),T-O(N)
    char[] charT = t.toCharArray();// S-O(N),T-O(N)
    Arrays.sort(charS);// T-O(NlogN)
    Arrays.sort(charT);// T-O(NlogN)
    return Arrays.equals(charS, charT);// T:O(N)
}
```
### 方法B
```java
// 2:T:O(N) S:O(1)
public boolean isAnagram_2(String s, String t) {
    if (s.length() != t.length() ) {
        return false;
    }
    Map<Character, Integer> map = new HashMap<>(26);
    for (int i = 0; i < s.length(); i++) {// O(n)
        char chS = s.charAt(i);
        char chT = t.charAt(i);
        if (map.containsKey(chS)) {
            map.put(chS, map.get(chS) + 1);
        } else {
            map.put(chS, 1);
        }
        if (map.containsKey(chT)) {
            map.put(chT, map.get(chT) - 1);
        } else {
            map.put(chT, -1);
        }
    }
    Set<Map.Entry<Character, Integer>> entries = map.entrySet();
    for (Map.Entry<Character, Integer> entry : entries) {// O(n)
        if (entry.getValue() != 0) {
            return false;
        }
    }
    return true;
}
```
### 方法C
```java
// 3:T:O(N) S:O(1)
public boolean isAnagram_3(String s, String t) {
    if (s.length() != t.length() ) {
        return false;
    }
    // nagaram anagram
    int[] counter = new int[26];
    for (int i = 0; i < s.length(); i++) {// T:O(n)
        int chS = s.charAt(i) - 'a';
        int chT = t.charAt(i) - 'a';
        counter[chS]++;
        counter[chT]--;
    }
    for (int count : counter) {// T:O(n)
        if (count != 0) {
            return false;
        }
    }
    return true;
}
}
```
上次也是他写的最好，而且在方法上标了时间和空间复杂度，值得学习，另外，方法B中
```java
if (map.containsKey(chS)) {
    map.put(chS, map.get(chS) + 1);
} else {
    map.put(chS, 1);
}
if (map.containsKey(chT)) {
    map.put(chT, map.get(chT) - 1);
} else {
    map.put(chT, -1);
}
```
也可改成
```java
map.put(chS, map.getOrDefault(chS, 0) + 1);
map.put(chT, map.getOrDefault(chT, 0) - 1);
```
