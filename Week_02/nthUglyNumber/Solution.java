class Solution {
    public int nthUglyNumber(int n) {
        if ( n <= 0 || n > 1690 ) {
            throw new IllegalArgumentException("1 <= n <= 1690");
        }
        int[] nums = new int[n];
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                nums[i] = 1;
                continue;
            }
            int n2 = nums[a] * 2, n3 = nums[b] * 3, n5 = nums[c] * 5;
            nums[i] = Math.min(Math.min(n2, n3), n5);
            if (nums[i] == n2) a++;
            if (nums[i] == n3) b++;
            if (nums[i] == n5) c++;
        }
        return nums[n - 1];
    }
}
