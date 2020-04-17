class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while ( i < j ) {
            int minHeight = (height[i] < height[j])?height[i ++]:height[j --];
            int currentArea = (j - i + 1) * minHeight;
            maxArea = (currentArea > maxArea)?currentArea:maxArea;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = solution.maxArea(height);
        System.out.println(maxArea);
    }
}
