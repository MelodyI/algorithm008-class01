class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            if (map.containsKey(expect)) {
                return new int[]{map.get(expect), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new RuntimeException(String.format("未找到和为%d的元素", target));
    }
}
