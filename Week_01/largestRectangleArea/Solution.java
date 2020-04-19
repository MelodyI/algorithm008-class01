class Solution {

    public int largestRectangleArea(int[] heights) {
        int maxarea = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                int minheight = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++)
                    minheight = Math.min(minheight, heights[k]);
                maxarea = Math.max(maxarea, minheight * (j - i + 1));
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] heights = new int[]{2,1,5,6,2,3};
        int maxArea = solution.largestRectangleArea(heights);
        System.out.println(maxArea);
    }
}