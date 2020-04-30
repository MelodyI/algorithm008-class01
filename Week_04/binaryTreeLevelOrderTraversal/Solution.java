class Solution {

    private List<List<Integer>> ans;

    public List<List<Integer>> levelOrder(TreeNode root) {
        ans = new ArrayList<>();
        _dsf(root, 0);
        return ans;
    }

    private void _dsf(TreeNode node, int level) {
        // terminator
        if (node == null) return;
        // process current logic
        if (level > ans.size() - 1)
            ans.add(new ArrayList<Integer>());
        ans.get(level).add(node.val);
        // drill down
        _dsf(node.left, level + 1);
        _dsf(node.right, level + 1);
        // reverse state
    }
}
