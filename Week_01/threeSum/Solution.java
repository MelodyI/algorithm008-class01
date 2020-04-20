// https://leetcode-cn.com/problems/3sum/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int j = i + 1, k = nums.length - 1;
            while ( j < k ) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> current = new ArrayList<Integer>();
                    current.add(nums[i]);
                    current.add(nums[j]);
                    current.add(nums[k]);
                    result.add(current);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (k > j && nums[k] == nums[k+1]) k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result.toString());
    }
}
