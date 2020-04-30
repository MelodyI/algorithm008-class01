class Solution {
    int ans = 0;
    int[] su;
    public int findContentChildren(int[] g, int[] s) {
        su = new int[s.length];
        Arrays.sort(g);
        Arrays.sort(s);
        _find(g, s, 0);
        return ans;
    }
    private void _find(int[] g, int[] s, int i){
        // terminator
        if (i == g.length) return;
        // process current logic
        for (int j = 0; j < s.length; j++) {
            if (su[j] == 1) continue;
            if (s[j] >= g[i]) {
                ans++;
                su[j] = 1;
                break;
            }
        }
        // drill down
        if (i + 1 < g.length) _find(g, s, i + 1);
    }
}
