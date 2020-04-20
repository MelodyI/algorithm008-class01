public class Solution {

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    private void helper(Node root, List<Integer> res) {
        if (root != null) {
            if (root.children != null)
                for (int i = 0; i < root.children.size(); i++)
                    helper(root.children.get(i), res);
            res.add(root.val);
        }
    }
}
