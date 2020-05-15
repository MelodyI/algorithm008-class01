class Solution {
    public int jump(int[] nums) {
        int end = 0, maxPositions = 0, steps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPositions = Math.max(maxPositions, i + nums[i]);
            if (i == end) {
                end = maxPositions;
                steps++;
            }
        }
        return steps;
    }
}
