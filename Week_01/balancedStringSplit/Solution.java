class Solution {
    public int balancedStringSplit(String s) {
        int res = 0, flag = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') flag++;
            else flag--;
            if (flag == 0) res++;
        }
        return res;
    }
}
