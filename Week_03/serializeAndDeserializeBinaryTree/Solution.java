public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        return _rserialize(root, "");
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return _rdeserialize(data_list);
    }

    private String _rserialize(TreeNode root, String str) {
        // Recursive serialization.
        if (root == null) {
            str += "null,";
        } else {
            str += str.valueOf(root.val) + ",";
            str = _rserialize(root.left, str);
            str = _rserialize(root.right, str);
        }
        return str;
    }

    private TreeNode _rdeserialize(List<String> l) {
        // Recursive deserialization.
        if (l.get(0).equals("null")) {
            l.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = _rdeserialize(l);
        root.right = _rdeserialize(l);
        return root;
    }
}
