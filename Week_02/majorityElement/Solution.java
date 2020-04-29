class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        int times = 0;
        for (int k : map.keySet())
            if (map.get(k) > times) times = map.get(k);
        for (int k :map.keySet())
            if (map.get(k) == times)
                return k;
        return 0;
    }
}
