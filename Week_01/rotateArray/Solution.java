class Solution {
    public void rotate(int[] nums, int k) {
        int tmp, prev;
        for (int i = 0 ; i < k; i++) {
            prev = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                tmp = nums[j];
                nums[j] = prev;
                prev = tmp;
            }
        }
    }
}
