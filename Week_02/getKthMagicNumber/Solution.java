class Solution {
    public int getKthMagicNumber(int k) {
        int[] res = new int[k];
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < k ; i++) {
            if (i == 0) {
                res[i] = 1;
                continue;
            }
            int n3 = res[a] * 3;
            int n5 = res[b] * 5;
            int n7 = res[c] * 7;
            res[i] = Math.min(Math.min(n3, n5), n7);
            if (res[i] == n3) a++;
            if (res[i] == n5) b++;
            if (res[i] == n7) c++;
        }
        return res[k-1];
    }
}
