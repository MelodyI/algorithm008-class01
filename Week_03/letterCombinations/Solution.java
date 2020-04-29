class Solution {

    HashMap<String, String> phone = new HashMap<>();
    List<String> ans = new ArrayList<>();

    public Solution() {
        phone.put("2", "abc");
        phone.put("3", "def");
        phone.put("4", "ghi");
        phone.put("5", "jkl");
        phone.put("6", "mno");
        phone.put("7", "pqrs");
        phone.put("8", "tuv");
        phone.put("9", "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() > 0)
            _backtrack("", digits);
        return ans;
    }

    private void _backtrack(String combination, String nextDigits) {
        if (nextDigits.length() == 0){
            ans.add(combination);
            return;
        }
        String digit = nextDigits.substring(0, 1);
        String letters = phone.get(digit);
        for (int i = 0; i < letters.length(); i++) {
            String letter = phone.get(digit).substring(i, i + 1);
            _backtrack(combination + letter, nextDigits.substring(1));
        }
    }
}
