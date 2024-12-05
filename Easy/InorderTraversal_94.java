package Easy;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
    public static void main(String[] args) {
        InorderTraversal_94 inorderTraversal = new InorderTraversal_94();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> result = inorderTraversal.inorderTraversal(root);
        System.out.println(result);
    }
}
