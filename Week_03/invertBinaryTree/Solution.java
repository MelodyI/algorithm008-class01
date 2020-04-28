class Solution {
    public TreeNode invertTree(TreeNode root) {
        _invert(root);
        return root;
    }

    private void _invert(TreeNode node) {
        // ternimator
        if (node == null) return;
        // process current logic
        if (node.left != null || node.right != null) {
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        // drill down
        if (node.left != null) _invert(node.left);
        if (node.right != null) _invert(node.right);
        // restore current status
    }
}
