import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int fi = -100, fj = -100, fk = -100;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1, k = nums.length - 1; j < k; ) {
                if (-1 * nums[i] < nums[j] + nums[k]) {
                    k--;
                } else if (-1 * nums[i] > nums[j] + nums[k]) {
                    j++;
                } else {
                    if (result.size() > 0 && fi == nums[i] && fj == nums[j] && fk == nums[k]) {
                        //duplicate
                    } else {
                        fi = nums[i];
                        fj = nums[j];
                        fk = nums[k];

                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        result.add(tmp);
                    }
                    j++;
                    k--;
                }
            }
        }

        LinkedHashSet<List<Integer>> set = new LinkedHashSet<List<Integer>>(result.size());
        set.addAll(result);
        result.clear();
        result.addAll(set);
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result.toString());
    }
}
