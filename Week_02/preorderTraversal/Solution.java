import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) helper(root.left, res);
            if (root.right != null) helper(root.right, res);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        //
        List<Integer> result = solution.preorderTraversal(root);
        //
        List<Integer> expect = new ArrayList<Integer>();
        expect.add(1);
        expect.add(2);
        expect.add(3);
        //
        System.out.println(result.toString());
        System.out.println(expect.toString());
        //
        Arrays.equals(result.toArray(), expect.toArray());
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
