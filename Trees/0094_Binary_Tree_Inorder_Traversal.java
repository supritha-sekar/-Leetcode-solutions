
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inOrder(l, root);
        return l;
    }

    public void inOrder(List<Integer> l, TreeNode root) {
        if (root == null) return;

        inOrder(l, root.left);
        l.add(root.val);
        inOrder(l, root.right);
    }
}
