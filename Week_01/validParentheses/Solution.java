import java.util.Stack;
import java.util.HashMap;

class Solution {

    private HashMap<Character, Character> mappings;

    public Solution() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //
        String s1 = "()";
        boolean r1 = solution.isValid(s1);
        System.out.println(r1);
        //
        String s2 = "()[]{}";
        boolean r2 = solution.isValid(s2);
        System.out.println(r2);
        //
        String s3 = "(]";
        boolean r3 = solution.isValid(s3);
        System.out.println(r3);
    }
}