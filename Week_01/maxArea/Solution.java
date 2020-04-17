class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while ( left < right ) {
            int minHeight = (height[left] < height[right])?height[left++]:height[right--];
            int currentArea = (right - left + 1) * minHeight;
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
