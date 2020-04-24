import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] word = str.split(" ");
        if (pattern.length() != word.length) {
            return false;
        }
        Map<Object, Integer> map = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            Integer pi = map.put(pattern.charAt(i), i);
            Integer si = map.put(word[i], i);
            System.out.println("-----");
            System.out.println(pi);
            System.out.println(si);
            if (!Objects.equals(pi, si)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println(solution.wordPattern(pattern, str));
    }
}
