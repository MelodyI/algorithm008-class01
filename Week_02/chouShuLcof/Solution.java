class Solution {
    public int nthUglyNumber(int n) {
        if ( n <= 0 || n > 1690 ) {
            throw new IllegalArgumentException("1 <= n <= 1690");
        }
        int[] nums = new int[n];
        for (int i = 1, j = 0; i < Integer.MAX_VALUE, j < n; i++) {
            if ( i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                nums[j++] = i;
            }
        }
        return nums[n - 1];
    }
}
