class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        // first
        if (nums.length == 1) return nums[0];
        // second
        if (nums[right] > nums[left])
            return nums[left];
        // main
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1])
                return nums[mid + 1];
            if (nums[mid] < nums[mid - 1])
                return nums[mid];
            if (nums[mid] >= nums[0])
                left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
